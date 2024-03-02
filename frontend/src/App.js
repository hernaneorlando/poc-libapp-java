import './App.css';
import { useState, useEffect } from 'react';

function App() {
  const [ authors, setAuthors] = useState([]);
  const [ users, setUsers ] = useState([]);
  
  useEffect(() => {
    fetch('http://localhost:8080/authors')
      .then(response => response.json())
      .then(data => setAuthors(data));

    fetch('http://localhost:8080/users')
      .then(response => response.json())
      .then(data => setUsers(data));
  }, []);

  return (
    <main>
      <h1>List of Authors</h1>
      <table>
        <thead>
          <tr>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Date of birth</th>
          </tr>
        </thead>
        <tbody>
          {authors ? authors.map(author =>
            <tr>
              <td>{author.firstName}</td>
              <td>{author.lastName}</td>
              <td>{author.dateOfBirth}</td>
            </tr>
          ) : 'Loading...'}
        </tbody>
      </table>

      <h1>List of Users</h1>
      <table>
        <thead>
          <tr>
            <th>Alias</th>
            <th>Email</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Role</th>
          </tr>
        </thead>
        <tbody>
          {users ? users.map(user =>
            <tr>
              <td>{user.alias}</td>
              <td>{user.email}</td>
              <td>{user.firstName}</td>
              <td>{user.lastName}</td>
              <td>{user?.role?.name}</td>
            </tr>
          ) : 'Loading...'}
        </tbody>
      </table>
    </main>
  );
}

export default App;
