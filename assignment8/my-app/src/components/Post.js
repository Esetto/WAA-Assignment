const Post = (props) => {

    return (
        <div className="content">
            <label> Id: {props.id}</label><br></br>
            <label> Title: {props.title}</label><br></br>
            <label> Author: {props.author}</label><br></br>
            
        </div>
    );
}

export default Post;