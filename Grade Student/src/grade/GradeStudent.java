package grade;

import java.util.Scanner;
public class GradeStudent {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		begin();
// Midterm
		System.out.println("Midterm: ");
		double kqTrongSoGK = 0;
		int tsdtGiuaKi = 0;
		boolean ktTrongSo1 = false;
		do { 
			System.out.print("Weight (0-100)? "); // Hỏi trọng số điểm giữa kì
			if (input.hasNextInt()) { // Kiểm tra người dùng nhập số hay là chữ
				tsdtGiuaKi = input.nextInt(); //Nhập trọng số người dùng đạt được.
				if (tsdtGiuaKi < 0 || tsdtGiuaKi > 100) { // Kiểm tra người dùng nhập trọng số đúng quy định
					ktTrongSo1 = true;
					System.out.println("!!! Bạn phải nhập số từ 0-100 !!!");
				} else {
					ktTrongSo1 = false;
					boolean ktdDatDuoc = false;
					do {
						System.out.print("Score earned? "); // Hỏi điểm người dùng đạt được.
						if (input.hasNextInt()) {  // Kiểm tra người dùng nhập số hay là chữ
							ktdDatDuoc = false;
							int  dKiemDuoc = input.nextInt(); 
							boolean ktNhapTDT = false;
							do {
								System.out.print("Were scores shifted (1=yes, 2=no)? "); // Hỏi người dùng có điểm cộng không
								if (input.hasNextInt()) { // Kiểm tra người dùng nhập số hay là chữ
									ktNhapTDT = false;
									int tangdiemthi = input.nextInt();
									if (tangdiemthi == 1) { // kiểm tra lựa chọn của người dùng có được tăng điểm ko
										boolean ktDiemTang = false;
										do {
											System.out.print("Shift amount? "); // Hỏi người dùng có điểm công là bao nhiêu
											if (input.hasNextInt()) { // Kiểm tra người dùng nhập số hay là chữ
												ktDiemTang = false;
												int soDiemtang = input.nextInt();
												int tongDKiemDuoc = dKiemDuoc + soDiemtang;
												if ( tongDKiemDuoc > 100) { // kiểm tra giới hạn điểm của người dùng đạt được
													tongDKiemDuoc = 100;
												}
												System.out.println("Total points = " + tongDKiemDuoc + " /100");
												kqTrongSoGK = midterm(tongDKiemDuoc,tsdtGiuaKi);
												System.out.println("Weighted score = " + kqTrongSoGK + " / " + tsdtGiuaKi); // Tính trọng số điểm giữa kì  của ngưởi dùng đươc
											} else {
												ktDiemTang = true;
												System.out.println("!!! Bạn phải nhập số !!!");
												input.next();
											}
										} while (ktDiemTang);
									} else if (tangdiemthi == 2 ) {
										System.out.println("Total points = " + dKiemDuoc + " /100");
										kqTrongSoGK = midterm(dKiemDuoc,tsdtGiuaKi);
										System.out.println("Weighted score = " + kqTrongSoGK + " / " + tsdtGiuaKi);
									} else {
										ktNhapTDT = true;
										System.out.println("Bạn phải nhập 1 hoặc 2 để cho chúng tôi biết.");
									} 
								} else {
									ktNhapTDT = true;
									System.out.println("!!! Bạn phải nhập số !!!");
									input.next();
								}
							} while (ktNhapTDT);
						} else {
							ktdDatDuoc = true;
							System.out.println("!!! Bạn phải nhập số !!!");
							input.next();
						}
					} while (ktdDatDuoc);
				}
			} else {
				ktTrongSo1 = true;
				System.out.println("!!! Bạn phải nhập số !!!");
				input.next();
			}
		} while (ktTrongSo1);
		System.out.println("");
// Final
		System.out.println("Final: ");
		double kqTrongSoCK = 0;
		int tsdtCuoiKi =0;
		boolean ktTrongSo2 = false;
		do { 
			System.out.print("Weight (0-100)? "); // Hỏi trọng số điểm cuối kì
			if (input.hasNextInt()) { // Kiểm tra người dùng nhập số hay là chữ
				tsdtCuoiKi = input.nextInt(); //Nhập trọng số người dùng đạt được.
				if (tsdtCuoiKi < 0 || tsdtCuoiKi > 100) { // Kiểm tra người dùng nhập trọng số đúng quy định
					ktTrongSo2 = true;
					System.out.println("!!! Bạn phải nhập số từ 0-100 !!!");
				} else {
					ktTrongSo2 = false;
					boolean ktdDatDuoc = false;
					do {
						System.out.print("Score earned? "); // Hỏi điểm người dùng đạt được.
						if (input.hasNextInt()) { // Kiểm tra người dùng nhập số hay là chữ
							ktdDatDuoc = false;
							int  dKiemDuoc = input.nextInt(); 
							boolean ktNhapTDT = false;
							do {
								System.out.print("Were scores shifted (1=yes, 2=no)? "); // Hỏi người dùng có điểm cộng không
								if (input.hasNextInt()) { // Kiểm tra người dùng nhập số hay là chữ
									ktNhapTDT = false;
									int tangdiemthi = input.nextInt();
									if (tangdiemthi == 1) {  // kiểm tra lựa chọn của người dùng có được tăng điểm ko
										boolean ktDiemTang = false;
										do {
											System.out.print("Shift amount? "); // Hỏi điểm người dùng được tăng là bao nhiêu
											if (input.hasNextInt()) { // Kiểm tra người dùng nhập số hay là chữ
												ktDiemTang = false;
												int soDiemtang = input.nextInt();
												int tongDKiemDuoc = dKiemDuoc + soDiemtang;
												if ( tongDKiemDuoc > 100) { // Kiểm tra giới hạn điểm của người dùng đạt được
													tongDKiemDuoc = 100;
												}
												System.out.println("Total points = " + tongDKiemDuoc + " /100"); 
												kqTrongSoCK = finalterm(tongDKiemDuoc,tsdtCuoiKi);
												System.out.println("Weighted score = " + kqTrongSoCK + " / " + tsdtCuoiKi); // Tính trọng số điểm cuối kì của người dùng đạt được
											} else {
												ktDiemTang = true;
												System.out.println("!!! Bạn phải nhập số !!!");
												input.next();
											}
										} while (ktDiemTang);
									} else if (tangdiemthi == 2 ) {
										System.out.println("Total points = " + dKiemDuoc + " /100");
										kqTrongSoCK = finalterm(dKiemDuoc,tsdtCuoiKi);
										System.out.println("Weighted score = " + finalterm(dKiemDuoc,tsdtCuoiKi) + " / " + tsdtCuoiKi);
									} else {
										ktNhapTDT = true;
										System.out.println("Bạn phải nhập 1 hoặc 2 để cho chúng tôi biết.");
									} 
								} else {
									ktNhapTDT = true;
									System.out.println("!!! Bạn phải nhập số !!!");
									input.next();
								}
							} while (ktNhapTDT);
						} else {
							ktdDatDuoc = true;
							System.out.println("!!! Bạn phải nhập số !!!");
							input.next();
						}
					} while (ktdDatDuoc);
				}
			} else {
				ktTrongSo2 = true;
				System.out.println("!!! Bạn phải nhập số !!!");
				input.next();
			}
		} while (ktTrongSo2);
		System.out.println("");
// Homework
		int tongDiemDatDuoc = 0;
		int tongDiemToiDa = 0;
		double kqTrongSoHW = 0;
		int tsBaiTap = 0;
		System.out.println("Homework:");
		boolean ktTrongSo3 = false;
		do {
			System.out.print("Weight (0-100)? "); // Hỏi trọng số của bài tập về nhà
			if (input.hasNextInt()) { // Kiểm tra người dùng nhập số hay là chữ
				tsBaiTap = input.nextInt(); 
				if (tsBaiTap > 100 || tsBaiTap < 0) { 
					ktTrongSo3 = true;
					System.out.println("!!! Bạn phải nhập số từ 0-100 !!!"); // Hỏi điểm người dùng đạt được
				} else if (tsdtGiuaKi+ tsdtCuoiKi+ tsBaiTap != 100) {
					ktTrongSo3 = true;
					System.out.println("Tổng trọng số của cả 3 phần thi phải chính xác 100");
				} else {
					ktTrongSo3 = false;
					boolean ktsBaiTap = false;
					do {
						System.out.print("Number of assignments? "); // Hỏi số bài tập về nhà
						if (input.hasNextInt()) {
							ktsBaiTap = false;
							int soBaiAsm = input.nextInt();
							for (int i = 1 ; i <= soBaiAsm; i ++ ) {
								System.out.print("Assinment " + i  + " score and max? ") ; // Hỏi điểm số thực và số điểm tối đa
								if (input.hasNextInt()) { // Kiểm tra người dùng nhập số hay là chữ
									int diemSoThuc = input.nextInt();
									tongDiemDatDuoc += diemSoThuc;
									int diemToiDa = input.nextInt() ;
									tongDiemToiDa += diemToiDa;
									if (diemSoThuc > diemToiDa) { // Kiểm tra số điểm của người dùng đạt được phải nhỏ hơn điểm tối đa
										i--;
										System.out.println("Điểm thực không thể cao hơn điểm tối đa");
									}
								} else {
									i --;
									System.out.println("!!! Bạn phải nhập số !!!");
									input.next();
								}
							}
							if (tongDiemDatDuoc >150) { //Kiểm tra điểm tối đa bài asm vượt quá 150 điểm thì cũng chỉ tính là 150 điểm
								tongDiemDatDuoc = 150;
							}
							boolean ktChuyenCan = false;
							do {
								System.out.print("How many sections did you attend? "); // Hỏi số buổi điểm danh 
								if (input.hasNextInt()) { // Kiểm tra người dùng nhập số hay là chữ
									ktChuyenCan = false;
									int diemChuyenCan = input.nextInt();
									int tdChuyenCan = diemChuyenCan * 5;
									if (tdChuyenCan >30) { // Kiểm tra điểm cộng phần chuyên cần ko vượi quá 30 điểm 
										tdChuyenCan = 30;
									}
									System.out.println("Section points = " + tdChuyenCan + " / 30");
									System.out.println("Total points = " + (tongDiemDatDuoc + tdChuyenCan) + " / " + (tongDiemToiDa+ 30));
									double trongSoHW = (double)(tongDiemDatDuoc + tdChuyenCan)/(tongDiemToiDa+ 30);
									kqTrongSoHW = homework(trongSoHW,tsBaiTap);
									System.out.println("Weighted score = " + kqTrongSoHW + " / " + tsBaiTap +"\n"); // Tính trọng số điểm bài tập về nhà của người dùng
									double kqcuoicung = report(kqTrongSoGK,kqTrongSoCK,kqTrongSoHW);
									System.out.println("Overrall percentage = " + kqcuoicung);
									double minGrade = 0.0;
									if (kqcuoicung == 100 ) {  // Kiểm quy tắc tính min grade
										minGrade = 4.0;
									} else if (kqcuoicung >= 85 && kqcuoicung <100) {
										minGrade = 3.0;
									} else if (kqcuoicung >= 75 && kqcuoicung < 85) {
										minGrade = 2.0;
									} else if (kqcuoicung >= 65 && kqcuoicung < 75) {
										minGrade = 7.0;
									} else {
										minGrade = 0.0;
									}
									System.out.println("Your grade will be at least: " + minGrade);
									System.out.println("<< your custom grade message here >>");
								} else {
									ktChuyenCan = true;
									System.out.println("!!! Bạn phải nhập số !!!");
									input.next();
								}
							} while (ktChuyenCan);
						} else {
							ktsBaiTap = true;
							System.out.println("!!! Bạn phải nhập số !!!");
							input.next();
						}
					} while (ktsBaiTap);
				}
			} else {
				ktTrongSo3 = true;
				System.out.println("!!! Bạn phải nhập số !!!");
				input.next();
			}
		} while (ktTrongSo3) ;
	}
	public static void begin() {
		System.out.println("This program sreads exam/homework scores\nand reports your overall course grade.\n");		
	}
	public static double midterm (double tongDKiemDuoc, double tsdtGiuaKi) {
		return Math.round((tongDKiemDuoc/100) * tsdtGiuaKi * 10.0)/10.0;
	}
	public static double finalterm (double tongDKiemDuoc, double tsdtCuoiKi) {
		return Math.round((tongDKiemDuoc/100) * tsdtCuoiKi * 10.0)/10.0;
	}
	public static double homework (double trongSoHW,double tsBaiTap) {
		return Math.round(trongSoHW * tsBaiTap * 10.0)/10.0;
	}
	public static double report (double kqTrongSoGK,double kqTrongSoCK,double kqTrongSoHW)  {
		return kqTrongSoGK + kqTrongSoCK + kqTrongSoHW;
	}
}
