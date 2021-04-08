let isrunning = false;
let time = 0;

$(function(){

    $('#bnt').click(function(){
        if(isrunning){//중지
            isrunning = false;

        }else{//시작
            isrunning = true;
            $('#bnt').val = "중지";
            startTimer();
        }
    });
});

function startTimer(){
    setTimeout(function tick(){
        if(isrunning){
            console.log(time);
            time++;
            setTimeout(tick(),1000);
        }

    },1000)
}