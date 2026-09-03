const {MongoClient}=require("mongodb") // very very important
var exp=require("express")
var app=new exp()
var usr,pwd;

//get method api
app.get("/testfun",async(req,res)=>{ // important

    usr=req.query.name;
    pwd=req.query.pw;

    const data={"usr":usr,"pwd":pwd} // important

    var client=new MongoClient("mongodb://127.0.0.1:27017/"); // very very important
    client.connect() // very very important
    res.write("<h1>Express and MongoDB connection success<h2>"); // very very important

    try
    {
        const result=await client.db("jsd").collection("login").insertOne(data) // inserted data to mangodb
        console.log(result)
        res.write("<h1>Successfully Inserted</h1>") // inserted data to mangodb
    }
    catch
    {
        console.log("error")
        res.write("<h1>Error</h1>")
    }

   res.send()
   
}).listen(8891)

console.log("port listening at 8891....")