const {MongoClient}=require("mongodb") // very very important
var exp=require("express")
var app=new exp()

//get method api
app.get("/showall",async(req,res)=>{ // important


    var client=new MongoClient("mongodb://127.0.0.1:27017/"); // very very important
    client.connect() // very very important
    res.write("<h1>Read All datas from MongoDB<h2>"); // very very important

    try
    {
        const result=await client.db("jsd").collection("login").find({}).toArray() // show data from mangodb
        console.log(result)
        var len=result.length;
        res.write("<h1>Total Records Available:"+len+"</h1>") // total data to mangodb
        res.write("<table border='2' align='center' cellpadding='20' bgcolor='pink'>")
        res.write("<tr><th>S.No</th><th>User name</th><th>Password</th></tr>")
        for(i=0;i<len;i++)
        {
            res.write("<tr><td>"+(i+1)+"</td><td>"+result[i].usr+"</td><td>"+result[i].pwd+"</td></tr>")
        }
        res.write("</table>")
    }
    catch
    {
        console.log("error")
        res.write("<h1>data reading error</h1>")
    }

   res.send()
   
}).listen(8892)

console.log("port listening at 8892....")