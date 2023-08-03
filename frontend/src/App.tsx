import {FC, useEffect, useState} from 'react';
import axios from "axios";

interface IProps {

}

const App: FC<IProps> = () => {
    const [users, setUsers] = useState<{id:number, name:string, email:string, avatar:string}[]>([]);

    useEffect(() => {
        axios.get('/api/users').then(({data}) => setUsers(data))
    }, [])
    return (
        <div>
            <h1>Users:</h1>
            {users.map(user=>(
                <div>
                    <div>id: {user.id}</div>
                    <div>name: {user.name}</div>
                    <div>email: {user.email}</div>
                    <img src={`/api/av/${user.avatar}`} alt={user.name}/>
                </div>
            ))}
        </div>
    );
};

export {App};
