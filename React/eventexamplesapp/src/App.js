import { useState } from "react";
import CurrencyConvertor from "./CurrencyConvertor";

function App() {

  const [count, setCount] = useState(0);

  function increment() {
    setCount(count + 1);
  }

  function decrement() {
    setCount(count - 1);
  }

  function sayHello() {
    alert("Hello! Member!");
  }

  function increaseAndHello() {
    increment();
    sayHello();
  }

  function welcome(message) {
    alert(message);
  }

  function onPress() {
    alert("I was clicked");
  }

  return (

    <div style={{ margin: "20px" }}>

      <h2>{count}</h2>

      <button onClick={increaseAndHello}>
        Increment
      </button>

      <br /><br />

      <button onClick={decrement}>
        Decrement
      </button>

      <br /><br />

      <button
        onClick={() => welcome("Welcome")}
      >
        Say Welcome
      </button>

      <br /><br />

      <button onClick={onPress}>
        Click on me
      </button>

      <br /><br />

      <CurrencyConvertor />

    </div>

  );
}

export default App;