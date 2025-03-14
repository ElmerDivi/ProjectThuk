import React, { useEffect, useState } from 'react'
import http from '../axiosHandler'
import './PlayersList.css'

const PlayersList = (props) => {
    const [players,setPlayers]=useState([])
    const fetchplayers=()=>{
        http.get(`/event-players/${props.id}`)
        .then(res=>{
            setPlayers(res.data);
        })
    }
    useEffect(()=>{
        fetchplayers();
    },[])
    return (
        <div className='player_list'>
            <div className='player_list_text player_list_title'>Players Lists</div>
            <hr/>
            <div className='player_list_div'>
                <div className='col-12'>
                    <div className='col-3 inline_display margin_zero player_list_text'>Name</div>
                    <div className='col-3 inline_display margin_zero player_list_text'>Number</div>
                    <div className='col-3 inline_display margin_zero player_list_text'>Position</div>
                    <div className='col-3 inline_display margin_zero player_list_text'>Fees Paid</div>
                </div>
                <div className='col-12'>
                    <div className='col-3 inline_display margin_zero player_list_text'>Rushikesh</div>
                    <div className='col-3 inline_display margin_zero player_list_text'>9923302232</div>
                    <div className='col-3 inline_display margin_zero player_list_text'>Defender</div>
                    <div className='col-3 inline_display margin_zero player_list_text'><input type='checkbox'/></div>
                </div>
            </div>
        </div>
    )
}

export default PlayersList