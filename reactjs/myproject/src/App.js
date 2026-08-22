import React from 'react'

function App(props) {
  var arr=[]
  for(var k in props.data)
  {
    arr.push(k)
  }

  return (
    <div>
      <h1>Json with Array handling and also check null</h1>
      <h1>Student Setails</h1>
      <h2>Roll No.:{props.data.rno}</h2>
      <h2>Student Name: {props.data.sname}</h2>
      <h2>Tamil marks:{props.data.marks[0]}</h2>
      <h2>English marks:{props.data.marks[1]}</h2>
      <h2>Maths marks:{props.data.marks[2]}</h2>
      <h2>Result:{(props.data.marks[0]>34) && (props.data.marks[1]>34) && (props.data.marks[2]>34)?"PASS":"FAIL"}</h2>

      <h1>===============additional(smart way)===========================</h1>
      {arr.map((v)=><h2>{v}---&gt; {(props.data[v]===true && "PASS") || (props.data[v]===false && "FAIL") || props.data[v]}</h2>)}
    </div>
  )
}

export default App


/*import React from 'react'

export default function App(props) {
  
  var arr=[]
  for(var k in props.data)
  {
    arr.push(k)
  }

  return (
    <div>
      <h1>props using JSON data</h1>

      <h2>Roll No: {props.data.rno}</h2>
      <h2>Name: {props.data.sname}</h2>
      <h2>Mark: {props.data.mark}</h2>
      <h2>Result: {props.data.mark>=35?"pass":"fail"}</h2>
      <h2>is eligible to study: {props.data.iseligible?"eligible":"not eligible"}</h2>

      <br></br>
      <h2>============================================================</h2>
      {arr.map((v)=><h2>{v}----&gt; {props.data[v]}</h2>)}
      <h2>============================================================</h2>
      {arr.map((v)=><h2>{v}----&lt; {props.data[v]}</h2>)}
      <h2>======================extra Learner========================</h2>
      {arr.map((v)=><h2>{v}---- {(props.data[v]===true && "Eligible") || (props.data[v]===false && "Not Eligible") || props.data[v]}</h2>)}
      <h2>============================================================</h2>
      {arr.map((v)=><h2>{v}---- {props.data[v]===true?"Eligible":props.data[v]}</h2>)}
    </div>
  )
}

/*import React from 'react'

function App(props) {
  return (
    <div>
      <h1>Student Details:</h1><br></br>
      <h2>Roll No.: {props.data.rno}</h2>
      <h2>Student Name: {props.data.sname}</h2>
      <h2>Student Mark: {props.data.mark}</h2>
      <h2>Student Result: {props.data.result}</h2>
      <h2>Student Eligiblity: {props.data.iseligible}</h2>
    </div>
  )
}

export default App


/*import React from 'react'

function App(props) {
  return (
    <div>
      <h1>Props using Array</h1><br></br>
      Tamil Mark: {props.data[0]}<br></br>
      English Mark: {props.data[1]}<br></br>
      Maths Mark: {props.data[2]}<br></br>
      Science Mark: {props.data[3]}<br></br>
      Social Science Mark: {props.data[4]}<br></br>

      {props.data.map((item,index)=><><br></br>mark:{index} = {item}</>)}
    </div>
  )
}

export default App


/*import React from 'react'

function App(props) {
  return (
    <div>
      <h1>props: properties</h1>
      <h2>share data from one Component to another Component</h2>
      <h2>Your Name: {props.data}</h2>
    </div>
  )
}

export default App



/*import React from 'react'

function App() {
  var stud={
    sno:1,
    sname:'Keerthivasan G',
    marks:{
      tamil:100,
      english:100,
      maths:101,
      science:99,
      social:100
    },
    rank:1,
    result:"PASS"
  }
  return (
    <div>
      <h1>JSON</h1>
      <h2>Student number:{stud.sno}</h2>
      <h2>Student name:{stud.sname}</h2>
      <h2>Student tamil mark:{stud.marks["tamil"]}</h2>
      <h2>Student english mark:{stud.marks["english"]}</h2>
      <h2>Student maths mark:{stud.marks.maths}</h2>
      <h2>Student science mark:{stud.marks.science}</h2>
      <h2>Student social mark:{stud.marks["social"]}</h2>
      <h2>Student Rank:{stud.rank}</h2>
      <h2>Student Result:{stud.result}</h2>
    </div>
  )
}

export default App


/*import React from 'react'
function App() {
  var stud={
    sno:1001,
    sname:'Keerthivasan G',
    mark:100,
    rank:1,
    result:"pass"
  }
  return (
    <div>
      <h1>JSON</h1>
      <h2>Student number:{stud.sno}</h2>
      <h2>Student name:{stud.sname}</h2>
      <h2>Student Mark:{stud.mark}</h2>
      <h2>Student Rank:{stud.rank}</h2>
      <h2>Student Result:{stud.result}</h2>
    </div>
  )
}

export default App



/*import React from 'react'
function App() {
  var arr=[11,22,33,44,55,66,77,88,99];
  var big=arr[0];
  return (
    <div>
      
      <h1>Array Demo</h1>
      {arr.map((item)=>item)}
      <br></br>
      {arr.map((item)=><>{item} </>)}
      {arr.map((item)=><><br></br>{item}</>)}

      <ol type='I'>
      {arr.map((v)=><li>{v}</li>)}
      <h1>biggest Number</h1>
      </ol>

      <div style={{display:"none"}}>
      {arr.map((v)=><>{big<v && <>{big=v}</>}</>)}
      </div>

      <h1>biggest number: {big}</h1>

    </div>
  )
}

export default App



/*import React from 'react'

function App() {
  var arr=[11,22,33,44,55,66]
  return (
    <div>
      <h1>Array</h1>
      <h2>array value index : 0 : {arr[0]}</h2>
      <h2>array value index : 1 : {arr[1]}</h2>
      <h2>array value index : 2 : {arr[2]}</h2>
      <h2>array value index : 3 : {arr[3]}</h2>
      <h2>array value index : 4 : {arr[4]}</h2>
      <h2>array value index : 5 : {arr[5]}</h2>
    </div>
  )
}

export default App


/*function App() {
  var avg=90;
  var res="fail";
  return (
    <div>
      <h1>4. Nested if</h1>
      <h1>Grade System:</h1>
      <h2>
        { 
        (res==="pass" && ((avg>=85 && "outstanding") || 
        (avg>=75 && "excellent")||
        (avg>=65 && "very good") || 
        (avg>=55 && "good") || 
        "fair")) || "no grade"
        }
      </h2>
    </div>
  )
}

export default App

/*import React from 'react'

function App() {
  var mark=100;
  return (
    <div>
      <h1>Grade Calculation</h1>
      <h2>
        {mark} is {(mark>=85 && "outstanding") || (mark>=75 && "excellent")||(mark>=65 && "very good") || (mark>=55 && "good") || "fair"}
      </h2>
    </div>
  )
}

export default App

/*import React from 'react'

function App() {
  var n=0;
  return (
    <div>
      <h1>3. if else if Statement or else if ladder</h1>
      <h2>{n} is {(n>0 && "+ve") || (n<0 && "-ve")|| "zero"}</h2>
    </div>
  )
}

export default App



/*import React from 'react'

function App() {
  var y=2028;
  return (
    <div>
      <h1> Find given no. is leap year or not using if else</h1>
      <h2>Year :{y}</h2>
      <h2>{y} is {(y%4===0 && "Leap" ) || "Not leap"} Year</h2>
    </div>
  )
}
export default App

/*import React from 'react'

function App() {
  var n=47;
  return (
    <div>
      <h1> Find given no. is even or odd using if else</h1>
      <h2>Number:{n}</h2>
      <h2>{n} is {(n%2===0 && "Even" ) || "Odd"} Number</h2>
    </div>
  )
}

export default App


/*import React from 'react'

function App() {
  var n1=100;
  var n2=1001;
  return (
    <div>
      <h1>greatest among 2 numbers using if else</h1>

      <h2>number 1: {n1}</h2>
      <h2>number 2: {n2}</h2>
      <h2>{(n1>n2 && n1) || n2 } is biggest number</h2>
    </div>
  )
}
export default App


/*import React from 'react'

function App() {
  var mark=100;
  return (
    <div>
      <h1>2.if else Statement</h1>
      <h2>Mark : {mark}</h2>
      <h2>Result:</h2>
      <h2>{(mark>34 && "PASS") || "FAIL"}</h2>   
    </div>
  )
}

export default App

/*import React from 'react'

function App() {
  var mark=100;
  return (
    <div>
      <h1>1. Simple If Statement</h1>
      <h2>Mark : {mark}</h2>
      <h2>Result:</h2>
      <h2>{mark>34 && "PASS"}</h2>
      <h2>{mark<=34 && "FAIL"}</h2>   
    </div>
  )
}

export default App


/*import './App.css'
import React from 'react'
import myimg from './img/Nature.jpg'
function App() {
  return (
    <div align="center">
      <img src={myimg} width="90%" alt="not found"></img>
    </div>
  )
}

export default App
/*import React from 'react'
import myimg from './img/Nature.jpg'
function App() {
  return (
    <div align="center">
      <img src={myimg} width="90%" alt="not found"></img>
    </div>
  )
}

export default App

/*var App=()=>{
  var a=10
  var b=20
  var c=30
  return(
    <>
    <h1>Welcome to React Expression</h1>
    <h2>A value:{a}</h2>
    <h2>B value:{b}</h2>
    <h2>C value:{c}</h2>
    <h2>Total values:{a+b+c}</h2>
    </>
  )
}
export default App;

/*import React from "react";
class App extends React.Component
{
  render(){
    return(
      <>
        <h1>welcome to react js</h1>
        <h2>welcome to react js</h2>
        <h6>welcome to react js</h6>
      </>
    )
  }
}
export default App;
/*import logo from './logo.svg';
import './App.css';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
    </div>
  );
}

export default App;*/
