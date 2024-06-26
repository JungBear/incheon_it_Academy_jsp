function 내함수(num:(number | string)) : number {
   // 숫자 => 6
    // 문자열 => 에러    
    // 모호한 상황일 때는 if문으로 자료형을 확인하고 계산

    // 숫자일 경우
    if(typeof num === 'number'){
        return num * 2;
    }  
    // 문자열일 경우
    else if(typeof num === 'string'){
        let temp = Number(num);  // 형변환
        return temp * 2;
    } else{
        return 0;
    }
}

내함수(3);
내함수('4');

