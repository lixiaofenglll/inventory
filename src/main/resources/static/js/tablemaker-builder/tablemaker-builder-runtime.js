//=======================【创建列表】=============================
//为table表构建表
//装填在在select选择器上
//method_in为装填方法
//cover-覆盖 append-追加 before-在选择器前 after-选择器前
//method_build是tablemaker_builder中对应的方法名
function tablemakerBuild(table,select,method_in,method_build){
    var html = ""
    if(tablemaker_arguments[select]==undefined||tablemaker_arguments[select]._table!=table){
        tablemaker_arguments[select]={
            "_table":table,
            "page":1,
            "limit":tablemaker_list_config[table].countPerPage
        }
    }
    html=tablemaker_builder[method_build](table)
    switch (method_in){
        case "append":
            $(select).append(html)
            break;
        case "before":
            $(select).before(html)
            break;
        case "after":
            $(select).after(html)
            break;
        case "cover":
        default:
            $(select).html(html)
    }
    setSizeOfTable(table,select)
}

//=======================【数据处理】=============================
//将数据和各种标识注入进样式中
//table表名
//line列名
//obj注入对象
//html样式
function tablemakerLineDataInjection(table,col,obj,html){
    var primary="head"

    if(obj!=null)  primary = obj[tablemaker_list_config[table]["primary_key"]];
    //输入唯一标识
    html= html.replaceAll(tablemaker_unique_symbol,table+col+primary)
    //表标识
    html= html.replaceAll(tablemaker_table_symbol,table)
    //列标识
    html= html.replaceAll(tablemaker_col_symbol,table+col)
    //行标识
    html= html.replaceAll(tablemaker_line_symbol,table+primary)
    //值
    if(obj!=null)  html= html.replaceAll(tablemaker_value_symbol,obj[col])
    //插入头
    html= html.replaceAll(tablemaker_head_symbol,col)

    return html

}
//设置目标select下的使用table表的宽度
function setSizeOfTable(table,select){
    var length =$("[line='"+table+"head']").children("").length
    var size =length*tablemaker_list_config[table].size+"px"
    $(select).css("width",size)
}
//根据表名得到参数注册器
function getTablemakerArguments(table){
    for(var key in tablemaker_arguments){
        if(tablemaker_arguments[key]._table==table){
            return key
        }
    }
}
//=======================【默认样式build】=============================
//=======================【tablemakerDefualtBuild】==================
//操作列 +数据列的默认形式
function tablemakerDefualtBuild(table){
    var html ="<thead>"
    html+=tablemakerDefualtBuildTh(table,tablemaker_defualt_templates_th)
    html+="</thead><tbody>"
    html+=tablemakerDefualtBuildTr(table,tablemaker_defualt_templates_tr)
    html+="</tbody>"
    return html
}
//创建表单体,使用操作列+数据列的默认形式
function tablemakerDefualtBuildTr(table,templates){
    var key = getTablemakerArguments(table)
    var list = tablemakerServiceGet(table, tablemaker_arguments[key],"post")
    var html=""
    for (var i = 0 ; i < list.length ; i++){
        var obj = list[i]
        html+=tablemakerLineDataInjection(table,null,obj,templates.tr)
        html+=tablemakerLineDataInjection(table,null,obj,templates.option)
        for(var key in getConstruct(table)){
            html+=tablemakerLineDataInjection(table,key,obj,templates.td)
        }
        html+="</tr>"
    }
    return html
}
//创建表头,使用操作列+数据列的默认形式
function tablemakerDefualtBuildTh(table,templates){
    var html=""
    //注入行
    html+=tablemakerLineDataInjection(table,null,null,templates.tr)
    //注入操作列
    html+=tablemakerLineDataInjection(table,null,null,templates.option)
    for(var key in getConstruct(table)){
        var title =""
        //判断是否已编写标题，否则使用标识作为列名
        if(getConstruct(table)[key].title!=undefined)title=getConstruct(table)[key].title
        else title=key
        //注入列名
        html+=tablemakerLineDataInjection(table,title,null,templates.th)
    }
    html+="</tr>"
    return html
}