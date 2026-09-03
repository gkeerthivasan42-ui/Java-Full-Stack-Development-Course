const {MongoClient} = require("mongodb")
var exp=require("express")
var app=new exp()
var pw=""
// get method api
app.get("/updatefun",async(req,res)=>{
    var client=new MongoClient("mongodb://127.0.0.1:27017/");
    client.connect()
    const data={"usr":req.query.name};
    pw=req.query.pw
    const udata={$set:{"pwd":pw}}
    res.write("<h1>update Record:</h1>")
    try
    {
        const result=await client.db("jsd").collection("login").updateOne(data,udata)
        console.log(result)                
        if(result.modifiedCount===1)
        {
            res.write("<h1>Successfully updated</h1>")
        }
        else
        {
            res.write("<h1>data not found</h1>")
        }
        
    }
    catch(err){
        console.log("error:",err)
        res.write("<h1>data reading error<h1>")
    }
    
    res.end()
}).listen(8895)

console.log("port listening at 8895........")