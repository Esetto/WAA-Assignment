import { useEffect, useState } from 'react';
import NewPost from '../components/newpost/NewPost';
import PostDetails from '../components/PostDetails/PostDetails';
import Posts from '../components/Posts';
import { ThemeColorContext } from '../store/ThemeColor';

import './Dashboard.css';

export default function Dashboard() {
    
    const [selectedState, setSelectedState] = useState(0);
    const[fetchFlag, setFetchflag] = useState(true);

   
    const changeFetchFlag = () => {
        setFetchflag(!fetchFlag);
    }

    const setSelected = (id) => {
        setSelectedState(id);
    }
    useEffect(() => {
        return () => {
          console.log("Something was unmounted");
        };
      }, [fetchFlag]);

    


    return (
        <div>
        <ThemeColorContext.Provider>
        
            
            <div>
            <Posts setSelected={setSelected} fetchFlag={fetchFlag} />
            </div>
            <div>
                <PostDetails id={selectedState} changeFetchFlag={changeFetchFlag}/>
            </div>
            <div>
            {fetchFlag ? <NewPost changeFetchFlag={changeFetchFlag} /> : null}
            </div>
            </ThemeColorContext.Provider>
        </div>
    )
}
