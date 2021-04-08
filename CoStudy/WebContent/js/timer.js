let isrunning = false;
let time = 0;
let hour = 0;
let min = 0;
let sec = 0;

$(function(){

    $('#timer_bnt_start').click(function(){
        if(isrunning){//중지
            isrunning = false;
            $(this).val("시작");
        }else{//시작
            isrunning = true;
            $(this).val("중지");
            startTimer();
        }
    });
});

function startTimer(){
    setTimeout(function tick(){
        if(isrunning){
            time++;
            output();
            setTimeout(tick,1000);
        }
    },1000)
}

function output(){
    hour =  Math.floor(time / 3600);
    min =  Math.floor((time / 60) % 60);
    sec =  Math.floor(time % 60);

    let hours = (hour >= 10) ? hour : "0" + hour;
    let mins = (min >= 10) ? min : "0" + min;
    let secs = (sec >= 10) ? sec : "0" + sec;
    $('#time_output').text(hours + ":" + mins + ":" + secs);
}