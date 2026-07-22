import Cohort from "./Cohort";
import CohortDetails from "./CohortDetails";

function App() {

  return (
    <div>

      <h1>My Academy Dashboard</h1>

      {
        Cohort.map((item)=>(
          <CohortDetails
            key={item.id}
            cohort={item}
          />
        ))
      }

    </div>
  );
}

export default App;