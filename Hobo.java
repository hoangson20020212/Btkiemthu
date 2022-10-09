public class Hobo {

public static String Check(double Gpa, int Drl) {
	if((Drl<0)||(Gpa<0.0)||(Gpa>4.0)||(Drl>100)){
        return "Đầu vào không hợp lệ";
    } else if(Drl>80&&Gpa>3.6) {
        return  "Được học bổng";
    } else {
        return "Không được học bổng";
    }
    return "Error";
}