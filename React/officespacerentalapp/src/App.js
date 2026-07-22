import "./App.css";
import office from "./office.jpg";

function App() {

  const officeList = [
    {
      Name: "DBS",
      Rent: 50000,
      Address: "Chennai"
    },
    {
      Name: "TCS",
      Rent: 75000,
      Address: "Bangalore"
    },
    {
      Name: "Infosys",
      Rent: 45000,
      Address: "Hyderabad"
    }
  ];

  return (

    <div className="container">

      <h1>Office Space, at Affordable Range</h1>

      {
        officeList.map((item,index)=>(

          <div key={index}>

            <img
              src={office}
              alt="Office"
              className="officeImage"
            />

            <h2>Name : {item.Name}</h2>

            <h3
              className={
                item.Rent <= 60000
                ? "textRed"
                : "textGreen"
              }
            >
              Rent : Rs. {item.Rent}
            </h3>

            <h3>
              Address : {item.Address}
            </h3>

            <hr/>

          </div>

        ))
      }

    </div>

  );
}

export default App;