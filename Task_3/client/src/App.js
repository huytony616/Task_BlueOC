import React from 'react';
import PostForm from './posts/PostForm';
import PostsList from './posts/PostsList';

function App() {
  return (
    <div className="app-container">
      <h1>React Redux Posts</h1>
      <PostForm />
      <hr />
      <PostsList />
    </div>
  );
}

export default App;
