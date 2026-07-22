import styles from "./CohortDetails.module.css";

function CohortDetails({ cohort }) {

  return (
    <div className={styles.box}>

      <h3
        style={{
          color: cohort.status === "Ongoing" ? "green" : "blue"
        }}
      >
        {cohort.title}
      </h3>

      <dl>
        <dt>Trainer</dt>
        <dd>{cohort.trainer}</dd>

        <dt>Duration</dt>
        <dd>{cohort.duration}</dd>

        <dt>Status</dt>
        <dd>{cohort.status}</dd>
      </dl>

    </div>
  );
}

export default CohortDetails;