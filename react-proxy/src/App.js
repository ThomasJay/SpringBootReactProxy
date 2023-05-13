import React, { useState, useEffect } from "react";
import axios from "axios";
import ReactJson from "react-json-view";
import "./App.css";

function App() {
  const [sampleJson, setSampleJson] = useState({ name: "empty json" });
  const getData = async () => {
    const { data } = await axios.get("/api/v1/sampleData");
    setSampleJson(data);
  };
  useEffect(() => {
    getData();
  }, []);

  return (
    <div className="App">
      <p>Hello world</p>
      <p>{JSON.stringify(sampleJson)}</p>
      <div style={{ width: "100%", textAlign: "left" }}>
        <ReactJson
          theme={"summerfruit"}
          iconStyle="triangle"
          src={sampleJson}
        />
      </div>
    </div>
  );
}

export default App;
