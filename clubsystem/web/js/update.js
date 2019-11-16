$(function () {
    //表单提交之前验证
    $("form").submit(function () {
        var name = $("#name").val();
        var age = $("#age").val();
        if (name == "" || age == "") {
            alert("会员姓名，年龄不能为空！");
            return false
        }
        return true;
    })
});

//删除功能
function funDel(id) {

    if (window.confirm("你确定要删除信息吗？")) {
        // alert(id);
        //get ajax
        $.get("del", {id: id},
            function (data) {
                // alert("Data Loaded: " + data);
                if(data==1) {
                    document.location.href = "all";
                }

            });
    }

}