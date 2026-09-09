//import event
var events=require("events")

//create object to events emitter
var eventEmitter=new events.EventEmitter();

//bind event (called)
const dis=()=>{ // dis function name and event handler
    console.log("events called")
}
eventEmitter.on("keerthi",dis)

//fire event (calling)
eventEmitter.emit("keerthi")