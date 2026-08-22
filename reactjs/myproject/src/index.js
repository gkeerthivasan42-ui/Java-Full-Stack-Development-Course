import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';

//var sname="Keerthivasan G"
//var mark=[100,99,98,100,100]
//var stud={rno:47,sname:"Keerthivasan G",mark:99,result:"pass",iseligible:"true"}
var stud={
  rno:1001,
  sname:"Keerthivasan G",
  marks:[99,100,88],
  result:null
}
const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <App data={stud}/>
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
