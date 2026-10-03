import React, { useState, useEffect } from 'react';
import axios from 'axios';
import ContactForm from './ContactForm';

const App = () => {
  const [contacts, setContacts] = useState([]);
  const [selectedUserId, setSelectedUserId] = useState(null);
  const [selectedUser, setSelectedUser] = useState(null);
  const [loading, setLoading] = useState(false);
  const [error, setError] = useState(null);

  // Task 4: Complete fetchContacts function
  const fetchContacts = async () => {
    setLoading(true);
    setError(null);

    try {
      const response = await axios.get(
        'https://jsonplaceholder.typicode.com/users'
      );
      setContacts(response.data);
    } catch (err) {
      setError(err.message || 'Failed to fetch contacts.');
    } finally {
      setLoading(false);
    }
  };

  // Task 5: Fetch contacts when component mounts
  useEffect(() => {
    fetchContacts();
  }, []);

  // Task 6: Modify handleUserSelect function
  const handleUserSelect = (userId) => {
    setSelectedUserId(userId);
    const user = contacts.find((c) => c.id === userId) || null;
    setSelectedUser(user);
  };

  const handleFormSubmitSuccess = (updatedData) => {
    // Optionally refetch or update local state after form submission
    fetchContacts();
  };

  return (
    <div className="app-container">
      <h1>Contact Management App</h1>

      {loading && <p>Loading contacts...</p>}
      {error && <p className="error">{error}</p>}

      <div className="contacts-list">
        <h2>Select a Contact</h2>
        <ul>
          {contacts.map((contact) => (
            <li
              key={contact.id}
              onClick={() => handleUserSelect(contact.id)}
              className={selectedUserId === contact.id ? 'selected' : ''}
              style={{
                cursor: 'pointer',
                fontWeight: selectedUserId === contact.id ? 'bold' : 'normal',
              }}
            >
              {contact.name} ({contact.email})
            </li>
          ))}
        </ul>
      </div>

      {selectedUser && (
        <div className="selected-contact-section">
          <h2>Update Contact: {selectedUser.name}</h2>
          <ContactForm
            selectedUser={selectedUser}
            onFormSubmit={handleFormSubmitSuccess}
          />
        </div>
      )}
    </div>
  );
};

export default App;
