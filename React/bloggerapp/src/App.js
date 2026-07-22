import "./App.css";

import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";
import CourseDetails from "./CourseDetails";

function App() {

  const books = [
    { id:101,bname:"Master React",price:670 },
    { id:102,bname:"Deep Dive into Angular 11",price:800 },
    { id:103,bname:"Mongo Essentials",price:450 }
  ];

  const blogs = [
    {
      id:1,
      title:"React Learning",
      author:"Stephen Biz",
      description:"Welcome to learning React!"
    },
    {
      id:2,
      title:"Installation",
      author:"Schwezdenier",
      description:"You can install React from npm."
    }
  ];

  const courses = [
    {
      id:1,
      name:"Angular",
      date:"4/5/2021"
    },
    {
      id:2,
      name:"React",
      date:"6/3/2020"
    }
  ];

  const showBooks = true;
  const showBlogs = true;
  const showCourses = true;

  return (

    <div className="container">

      <div className="card">
        {showCourses && <CourseDetails courses={courses}/>}
      </div>

      <div className="card">
        {showBooks && <BookDetails books={books}/>}
      </div>

      <div className="card">
        {showBlogs && <BlogDetails blogs={blogs}/>}
      </div>

    </div>

  );

}

export default App;