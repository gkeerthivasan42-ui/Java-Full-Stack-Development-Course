const {MongoClient}=require("mongodb")
var exp=require("express")
var app=new exp()

app.get("/delfun",async(req,res)=>{
    var client=new MongoClient("mongodb://127.0.0.1:27017/");
    client.connect()
    const data={"usr":req.query.name};
    res.write("<h1>Delete Record:<h2>");

    try
    {
        const result=await client.db("jsd").collection("login").deleteOne(data)
        console.log(result)
        var len=result.length;
        if(result.deletedCount===1)
        {
            res.write("<h1>Successfully Deleted</h1>")
        }
        else
        {
            res.write("<h1>data not found</h1>")
        }
    }
    catch
    {
        console.log("error")
        res.write("<h1>data reading error</h1>")
    }

   res.send()
   
}).listen(8894)

console.log("port listening at 8894....")