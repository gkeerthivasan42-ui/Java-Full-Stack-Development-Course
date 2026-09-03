var exp=require("express")
var app=new exp()
var usr,pwd;

//get method api
app.get("/testfun",(req,res)=>{

    usr=req.query.name;
    pwd=req.query.pw;

    //res.send("<h1>Welcome to Express JS</h1>")
    res.write("<h1>User Name:"+usr+"</h1>")
    res.write("<h1>User Name:"+pwd+"</h1>")
    //res.send()
    if(usr==="admin" && pwd==="admin@123")
    {
        res.write("<font color='green' size='7'>valid user</font>");
    }
    else
    {
        res.write("<font color='red' size='7'>invalid user</font>");
    }
   res.send()
   
}).listen(8891)

console.log("port listening at 8891....")