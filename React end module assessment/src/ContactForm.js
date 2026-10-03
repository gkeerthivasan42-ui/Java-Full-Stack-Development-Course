import React, { useState } from 'react';
import axios from 'axios';

const ContactForm = ({ selectedUser, onFormSubmit }) => {
  const [email, setEmail] = useState('');
  const [name, setName] = useState('');
  const [loading, setLoading] = useState(false);
  const [success, setSuccess] = useState(false);
  const [error, setError] = useState(null);

  const handleSubmit = async (e) => {
    e.preventDefault();
    setLoading(true);
    setSuccess(false);
    setError(null);

    // Prepare payload / request promises
    const updateEmailRequest = axios.put(
      `https://jsonplaceholder.typicode.com/users/${selectedUser.id}`,
      { ...selectedUser, email }
    );

    const createContactRequest = axios.post(
      'https://jsonplaceholder.typicode.com/users',
      { name, email }
    );

    // Task 2: Use Promise.all method to handle PUT and POST requests
    try {
      const [putResult, postResult] = await Promise.all([
        updateEmailRequest,
        createContactRequest,
      ]);

      setSuccess(true);
      if (onFormSubmit) {
        onFormSubmit({ putResult: putResult.data, postResult: postResult.data });
      }
    } catch (err) {
      setError(err.message || 'An error occurred during submission.');
    } finally {
      setLoading(false);
    }
  };

  return (
    <form onSubmit={handleSubmit} className="contact-form">
      {/* Task 3: Conditional Rendering Logic */}
      {loading && <div className="loading-indicator">Loading...</div>}
      {success && (
        <div className="success-message">Data submitted successfully!</div>
      )}
      {error && <div className="error-message">Error: {error}</div>}

      <div className="form-group">
        <label htmlFor="name">Name:</label>
        <input
          type="text"
          id="name"
          value={name}
          onChange={(e) => setName(e.target.value)}
          required
        />
      </div>

      <div className="form-group">
        <label htmlFor="email">Email:</label>
        <input
          type="email"
          id="email"
          value={email}
          onChange={(e) => setEmail(e.target.value)}
          required
        />
      </div>

      <button type="submit" disabled={loading}>
        {loading ? 'Submitting...' : 'Submit'}
      </button>
    </form>
  );
};

export default ContactForm;
