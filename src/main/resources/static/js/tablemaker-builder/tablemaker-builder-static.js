//builder注册器
var tablemaker_builder={
    "defualt":tablemakerDefualtBuild
}
//查询参数注册器
var tablemaker_arguments={

}
//唯一标识占位符
var tablemaker_unique_symbol="{{unique}}"
//表标识占位符
var tablemaker_table_symbol="{{table}}"
//列标识占位符
var tablemaker_col_symbol="{{col}}"
//行标识占位符
var tablemaker_line_symbol="{{line}}"
//值标识占位符
var tablemaker_value_symbol="{{value}}"
//表头占位符
var tablemaker_head_symbol="{{head}}"

//基本的默认样式
var tablemaker_defualt_html_td = "<td unique='{{unique}}' line='{{line}}'>{{value}}</td>"
var tablemaker_defualt_html_th = "<th unique='{{unique}}' line='{{line}}'>{{head}}</th>"
var tablemaker_defualt_html_option_head = "<th unique='{{unique}}' >操作</th>"
var tablemaker_defualt_html_option = "<td unique='{{unique}}' ><input type='button' class='btn-xs' value='删除' onclick=\"del('{{line}}')\"></td>"
var tablemaker_defualt_html_tr ="<tr line='{{line}}'>"

var tablemaker_defualt_templates_tr ={
    "tr":tablemaker_defualt_html_tr,
    "td":tablemaker_defualt_html_td,
    "option":tablemaker_defualt_html_option
}
var tablemaker_defualt_templates_th={
    "tr":tablemaker_defualt_html_tr,
    "th":tablemaker_defualt_html_th,
    "option":tablemaker_defualt_html_option_head
}