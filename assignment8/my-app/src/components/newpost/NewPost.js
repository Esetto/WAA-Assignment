import './NewPost.css';
import { useRef } from 'react';
import axios from 'axios';


const NewPost = (props) => {

    const NewPostForm = useRef();

    const addButtonClicked = () => {
        const form = NewPostForm.current;
        const data = {
            title: form['title'].value,
            author: form['author'].value,
            content: form['content'].value
        }
        axios.post('http://localhost:8080/posts', data)
            .then(response => {
                props.changeFetchFlag();
            })
            .catch()
    }

    return (
        <div className="NewPost">
            <form ref={NewPostForm}>
                <h1> Add Post</h1>

                <label>title</label>
                <input type="text" label={'title'} name={'title'} />

                <label>Author</label>
                <input type="text" label={'author'} name={'author'} />

                <label>Contetnt</label>
                <input type="text" label={'content'} name={'content'} />
            </form>

            <button onClick={addButtonClicked} > Add Post
            </button>
        </div>
    );

}

export default NewPost