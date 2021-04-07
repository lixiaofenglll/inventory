//=======================【注册配置文件】=============================
//使用json文件注册配置文件
function registeConfigByJson(location){
    var obj ={"url":location,"method":"get"}
    registeTablemakerConfig(obj)
}
//使用服务注册配置文件
function registeConfigByService(service,method){
    var obj={"url":service,"method":method}
    registeTablemakerConfig(obj)
}
//注册配置文件
function registeTablemakerConfig(obj){
    $.ajax({
        type:obj.method,
        url:obj.url,
        async:false,
        success: function (data){
            for (var i = 0 ; i < data.length;i++){
                var temp  = data[i]
                tablemaker_config[temp.name] ={}
                tablemaker_config[temp.name].title=temp.title;
                tablemaker_config[temp.name].local=temp.local;
                tablemaker_config[temp.name].method=temp.method;
            }
        }
    })
}

//=======================【注册和简单操作配置结构】=============================
//通过配置文件注册列表配置
function registeListTablemakerConfig(){
    //遍历配置文件得到地址
    for(var key in tablemaker_config){

        var tempConfig = getListTablemakerConfig(tablemaker_config[key].local,tablemaker_config[key].method)

        tablemaker_list_config[key]=tempConfig
    }
    registeErrorCode()
}
//得到配置文件信息
function getListTablemakerConfig(url, method){
    var temp ={}
    if(method=="json") method="get"
    $.ajax({
        type: method,
        url:url,
        async: false,
        success:function (data) {
            temp["title"]=data.title
            temp["subtitle"]=data.subtitle
            temp["desc"]=data.desc
            temp["countPerPage"]=data.countPerPage
            temp["services"]=data.services
            temp["security"]=data.security
            temp["error_code"]=data.error_code
            temp["size"]=data.size
            temp["construct"]={}
            for (var i = 0 ; i < data.construct.length ; i++){
                var value =data.construct[i]
                if(value["select"]!=undefined){
                    value["rev_select"]=reverseSelectList(value.select)
                }
                if(temp["primary_key"]==undefined&&value.primary_key==true){
                    temp["primary_key"]= value.name
                }
                temp.construct[value.name]=value

            }
        }
    })
    return temp
}

//获得文件结构
function getConstruct(name){
    return tablemaker_list_config[name].construct
}
//获得服务列表
function getService(name){
    return tablemaker_list_config[name].services
}
//获得权限列表
function getSecurity(name){
    return tablemaker_list_config[name].security
}
//注册错误码
function registeErrorCode(){
    for (var key in tablemaker_list_config){
        var temp = getConstruct(key)
        for(var key2 in temp){
            if(temp[key2]["error_code"]!=undefined){
                var error_code =temp[key2]["error_code"]
                for(var err in error_code){
                    error_code_list[err]=error_code[err]
                }
            }
        }
    }
}
//select反转
function reverseSelectList(map){
    var reverse={}
    for (var key in map){
        reverse[map[key]]=key
    }
    return reverse

}
