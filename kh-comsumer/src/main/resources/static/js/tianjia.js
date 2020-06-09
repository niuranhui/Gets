

function addout() {
    var userid=$("#userid").val();
    var username = $("#username").val();
    var birthday = new Date($("#birthday").val());
    var phone = $("#phone").val();
    var address = $("#address").val();
    var sex = $("#sex").val();
    var email = $("#email").val();
    var identitycard = $("#identitycard").val();
    var param = {};
    param.userId = userid;
    param.userName = username;
    param.birthday=birthday;
    param.phone=phone;
    param.address=address;
    param.sex=sex;
    param.Email=email;
    param.IdentityCard=identitycard;

    $.ajax({
        url:"cus",
        type:"post",
        data:param,
        dataType:"json",
        success:function (result){
            alert(result)
            alert("添加成功")
        }
    })

}