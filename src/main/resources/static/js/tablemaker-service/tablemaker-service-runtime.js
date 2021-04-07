//调用get方法获得列表
function tablemakerServiceGet(table,obj,method){
    //tablemakerCheckSecurity(table,"get")
    var temp ={}
    $.ajax({
        type:method,
        data:obj,
        async:false,
        url:getService(table).get,
        success:function (list){
            temp = list
        }
    })
    return temp
}