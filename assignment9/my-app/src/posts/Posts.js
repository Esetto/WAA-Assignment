import { useEffect, useState } from 'react';
import axios from 'axios';
import './Posts.css';

import Post from '../post/Post';

const Posts = (props) => {

    const [posts, setPosts] = useState([]);
    // [
    //     // { id: 111, title: 'Happiness', author: 'John' },
    //     // { id: 112, title: 'MIU', author: 'Dean' },
    //     // { id: 113, title: 'EnjoyLife', author: 'Jasmine' }
    // ]);

    const fetchPosts = () => {
        axios.get('http://localhost:8080/posts')
            .then(response => {
                
                setPosts(response.data);
            })
            .catch(error => {
                console.log(error.message)
            })

    }

    useEffect(() => {
        fetchPosts();
    },
        [props.fetchFlag]);


    const postsList = posts.map(post => 
         <Post
            id={post.id}
            title={post.title}
            author={post.author}
            key={post.id}
            setSelected={() => { props.setSelected(post.id) }}

        />
    )
    return (<>
        {postsList}
    </>);
}

export default Posts;