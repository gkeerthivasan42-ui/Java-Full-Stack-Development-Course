//import event
var events=require("events")

//create object to events emitter
var eventEmitter=new events.EventEmitter();

//bind event (called)
eventEmitter.on("keerthi",()=>{ // event name("keerthi"), event handler()=>{}
    console.log("events called")
})

//fire event (calling)
eventEmitter.emit("keerthi")
eventEmitter.emit("keerthi")
eventEmitter.emit("keerthi")
eventEmitter.emit("keerthi")
eventEmitter.emit("keerthi")