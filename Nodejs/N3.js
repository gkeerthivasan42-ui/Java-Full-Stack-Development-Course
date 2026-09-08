// callback: asynchronous: server never waits other process.
var fs=require("fs")
fs.readFile("text1.txt",(err,res)=>{
    if(err)
    {
        console.log("Error:"+err.toString())
    }
    else
    {
        console.log(res.toString())
    }
})
console.log("Program End")