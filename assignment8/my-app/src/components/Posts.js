import axios from "axios"
import { useEffect, useState } from "react"
import Post from "./Post"


const Posts = (props) => {
    const [postsState, setPostsState] = useState(
        [
            { id: 111, title: "Happiness", author: "John" },
            { id: 112, title: "MIU", author: "Dean" },
            { id: 113, title: "Enjoy Life", author: "Jasmine" }
        ]
    )
    const fetchProducts = () => {
        axios.get('http://localhost:8080/posts')
            .then(response => {
                setPostsState(response.data);
            })
            .catch(error => {
                console.log(error.message)
            })
    }
    useEffect(() => {
        fetchProducts()
    },
        [props.fetchFlag])
    
    const posts = postsState.map(post => {
        return <Post
            id={post.id}
            title={post.title}
            author={post.author}
            key={post.id}
            setPostsState={()=>{ props.setPostsState(post.id)}}
        />
    });
    return (<div className="posts">{posts}</div>);


}
export default Posts;