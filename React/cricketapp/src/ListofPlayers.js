function ListofPlayers({ players }) {
  return (
    <ul>
      {players.map((item) => (
        <li key={item.name}>
          Mr. {item.name} {item.score}
        </li>
      ))}
    </ul>
  );
}

export default ListofPlayers;