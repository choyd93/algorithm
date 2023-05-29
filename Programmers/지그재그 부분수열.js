function solution(phone_number) {
    let data = phone_number.split('-')

    // 첫 번호가 +82로 시작할 때 분기처리
    if (data[0] === '+82') {
        if (data[1] === '10'){
            if (data[2].lenght === 4 || data[3].length === 4) {
                return 3;
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    // 배열의 2번째 부분이 undefined이면 구분자가 없는 것으로 판단하여 분기처리
    } else if (data[1] === undefined){
        if (data[0].length === 11) {
            return 2;
        } else {
            return -1;
        }
    // 배열이 3개만 있을 때 숫자 길이 분기처리
    } else if (data[1].lenght === 4 || data[2].length === 4) {
        return 1;
    } else {
        return -1;
    }
}