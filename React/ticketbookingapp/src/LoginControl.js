import { useState } from "react";

import LoginButton from "./LoginButton";
import LogoutButton from "./LogoutButton";
import GuestGreeting from "./GuestGreeting";
import UserGreeting from "./UserGreeting";

function LoginControl() {

  const [isLoggedIn, setIsLoggedIn] = useState(false);

  function handleLoginClick() {
    setIsLoggedIn(true);
  }

  function handleLogoutClick() {
    setIsLoggedIn(false);
  }

  let button;

  let greeting;

  if (isLoggedIn) {

    greeting = <UserGreeting />;

    button =
      <LogoutButton
        onClick={handleLogoutClick}
      />;

  }
  else {

    greeting = <GuestGreeting />;

    button =
      <LoginButton
        onClick={handleLoginClick}
      />;

  }

  return (

    <div style={{ margin: "30px" }}>

      {greeting}

      <br />

      {button}

    </div>

  );

}

export default LoginControl;