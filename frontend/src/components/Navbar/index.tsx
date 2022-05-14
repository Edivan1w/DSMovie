import { ReactComponent as GithubIcon } from 'assets/img/GitHub.svg';
import './styles.css';

function NavBar(){

    return(
        <header>
      <nav className="container">
        <div className="demovie-nav-content">
          <h1>DSMovie</h1>
          <a href="https://github.com/Edivan1w?tab=repositories">
            <div className="dsmovie-contact-container">
              <GithubIcon />
              <p className="dsmovie-contact-link">/Edivan</p>
            </div>
          </a>

        </div>

      </nav>
    </header>
    );

}
export default NavBar;