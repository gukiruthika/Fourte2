package fourte;

import java.util.List;

public class Solution {
	void solve(int q, List<Object> eq) {
		String a1 =  com5(q, eq, "+");
			if (!a1.equals(""))
				System.out.println(a1);
			else {
				eq.remove("+");
				a1 = com5(q, eq, "-");
				if (!a1.equals(""))
					System.out.println(a1);
				else {
					eq.remove("-");
					a1 = com5(q, eq, "*");
					if (!a1.equals(""))
						System.out.println(a1);
					else {
						eq.remove("*");
						a1 = com5(q, eq, "/");
						if (!a1.equals(""))
							System.out.println(a1);
						else {
							eq.remove("/");
							a1 = com6(q, eq, "+", "+");
							if (!a1.equals(""))
								System.out.println(a1);
							else {
								eq.remove("+");
								eq.remove("+");
								a1 = com6(q, eq, "+", "-");
								if (!a1.equals(""))
									System.out.println(a1);
								else {
									eq.remove("+");
									eq.remove("-");
									a1 = com6(q, eq, "+", "*");
									if (!a1.equals(""))
										System.out.println(a1);
									else {
										eq.remove("+");
										eq.remove("*");
										a1 = com6(q, eq, "+", "/");
										if (!a1.equals(""))
											System.out.println(a1);
										else {
											eq.remove("+");
											eq.remove("/");
											a1 = com6(q, eq, "-", "-");
											if (!a1.equals(""))
												System.out.println(a1);
											else {
												eq.remove("-");
												eq.remove("-");
												a1 = com6(q, eq, "-", "*");
												if (!a1.equals(""))
													System.out.println(a1);
												else {
													eq.remove("-");
													eq.remove("*");
													a1 = com6(q, eq, "-", "/");
													if (!a1.equals(""))
														System.out.println(a1);
													else {
														eq.remove("-");
														eq.remove("/");
														a1 = com6(q, eq, "*", "*");
														if (!a1.equals(""))
															System.out.println(a1);
														else {
															eq.remove("*");
															eq.remove("*");
															a1 = com6(q, eq, "*", "/");
															if (!a1.equals(""))
																System.out.println(a1);
															else {
																eq.remove("*");
																eq.remove("/");
																a1 = com6(q, eq, "/", "/");
																if (!a1.equals(""))
																	System.out.println(a1);
																else {
																	eq.remove("/");
																	eq.remove("/");
																	a1 = com7(q, eq, "+","+","+");
																	if (!a1.equals(""))
																		System.out.println(a1);
																	else {
																		eq.remove("+");
																		eq.remove("+");
																		eq.remove("+");
																		a1 = com7(q, eq, "+","+","-");
																		if (!a1.equals(""))
																			System.out.println(a1);
																		else {
																			eq.remove("+");
																			eq.remove("+");
																			eq.remove("-");
																			a1 = com7(q, eq, "+","+","*");
																			if (!a1.equals(""))
																				System.out.println(a1);
																			else {
																				eq.remove("+");
																				eq.remove("+");
																				eq.remove("*");
																				a1 = com7(q, eq, "+","+","/");
																				if (!a1.equals(""))
																					System.out.println(a1);
																				else {
																					eq.remove("+");
																					eq.remove("+");
																					eq.remove("/");
																					a1 = com7(q, eq, "+","-","-");
																					if (!a1.equals(""))
																						System.out.println(a1);
																					else {
																						eq.remove("+");
																						eq.remove("-");
																						eq.remove("-");
																						a1 = com7(q, eq, "+","-","*");
																						if (!a1.equals(""))
																							System.out.println(a1);
																						else {
																							eq.remove("+");
																							eq.remove("-");
																							eq.remove("*");
																							a1 = com7(q, eq, "+","-","/");
																							if (!a1.equals(""))
																								System.out.println(a1);
																							else {
																								eq.remove("+");
																								eq.remove("-");
																								eq.remove("/");
																								a1 = com7(q, eq, "+","*","*");
																								if (!a1.equals(""))
																									System.out.println(a1);
																								else {
																									eq.remove("+");
																									eq.remove("*");
																									eq.remove("*");
																									a1 = com7(q, eq, "+","*","/");
																									if (!a1.equals(""))
																										System.out.println(a1);
																									else {
																										eq.remove("+");
																										eq.remove("*");
																										eq.remove("/");
																										a1 = com7(q, eq, "+","/","/");
																										if (!a1.equals(""))
																											System.out.println(a1);
																										else {
																											eq.remove("+");
																											eq.remove("/");
																											eq.remove("/");
																											a1 = com7(q, eq, "-","-","-");
																											if (!a1.equals(""))
																												System.out.println(a1);
																											else {
																												eq.remove("-");
																												eq.remove("-");
																												eq.remove("-");
																												a1 = com7(q, eq, "-","-","*");
																												if (!a1.equals(""))
																													System.out.println(a1);
																												else {
																													eq.remove("-");
																													eq.remove("-");
																													eq.remove("*");
																													a1 = com7(q, eq, "-","-","/");
																													if (!a1.equals(""))
																														System.out.println(a1);
																													else {
																														eq.remove("-");
																														eq.remove("-");
																														eq.remove("/");
																														a1 = com7(q, eq, "-","*","*");
																														if (!a1.equals(""))
																															System.out.println(a1);
																														else {
																															eq.remove("-");
																															eq.remove("*");
																															eq.remove("*");
																															a1 = com7(q, eq, "-","*","/");
																															if (!a1.equals(""))
																																System.out.println(a1);
																															else {
																																eq.remove("-");
																																eq.remove("*");
																																eq.remove("/");
																																a1 = com7(q, eq, "-","/","/");
																																if (!a1.equals(""))
																																	System.out.println(a1);
																																else {
																																	eq.remove("-");
																																	eq.remove("/");
																																	eq.remove("/");
																																	a1 = com7(q, eq, "*","*","*");
																																	if (!a1.equals(""))
																																		System.out.println(a1);
																																	else {
																																		eq.remove("*");
																																		eq.remove("*");
																																		eq.remove("*");
																																		a1 = com7(q, eq, "*","*","/");
																																		if (!a1.equals(""))
																																			System.out.println(a1);
																																		else {
																																			eq.remove("*");
																																			eq.remove("*");
																																			eq.remove("/");
																																			a1 = com7(q, eq, "*","/","/");
																																			if (!a1.equals(""))
																																				System.out.println(a1);
																																			else {
																																				eq.remove("*");
																																				eq.remove("/");
																																				eq.remove("/");
																																				a1 = com7(q, eq, "/","/","/");
																																				if (!a1.equals(""))
																																					System.out.println(a1);
																																				else {
																																					eq.remove("/");
																																					eq.remove("/");
																																					eq.remove("/");
																																					

																																				}

																																			}

																																		}

																																	}

																																}

																															}

																														}

																													}	

																												}

																											}

																										}

																									}

																								}

																							}	

																						}

																					}

																				}

																			}

																		}

																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

	Calculation ob1 = new Calculation();

	String com5(int q, List<Object> eq, String x) {
		String ans = "";
		eq.add(x);
		for (int i = 0; i < eq.size() - 1; i++) {
			for (int j = 0; j < eq.size(); j++) {
				if (j != i) {
					for (int k = 0; k < eq.size(); k++) {
						if (k != j & k != i) {
							for (int l = 0; l < eq.size(); l++) {
								if (l != k & l != j & l != i) {
									for (int m = 0; m < eq.size() - 1; m++) {
										if (m != l & m != k & m != j & m != i) {
											ans = eq.get(i).toString() + eq.get(j).toString() + eq.get(k).toString()
													+ eq.get(l).toString() + eq.get(m).toString();
											double a = ob1.calculate(ans);
											if (a == q) {
												return ans;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return "";
	}

	String com6(int q, List<Object> eq, String x, String y) {
		String ans = "";
		eq.add(x);
		eq.add(y);
		for (int i = 0; i < eq.size() - 2; i++) {
			for (int j = 0; j < eq.size(); j++) {
				if (j != i) {
					for (int k = 0; k < eq.size(); k++) {
						if (k != j & k != i) {
							for (int l = 0; l < eq.size(); l++) {
								if (l != k & l != j & l != i) {
									for (int m = 0; m < eq.size(); m++) {
										if (m != l & m != k & m != j & m != i) {
											for (int n = 0; n < eq.size() - 2; n++) {
												if (n != m & n != l & n != k & n != j & n != i) {
													ans = eq.get(i).toString() + eq.get(j).toString()
															+ eq.get(k).toString() + eq.get(l).toString()
															+ eq.get(m).toString() + eq.get(n).toString();
													double a = ob1.calculate(ans);
													if (a == q) {
														return ans;
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return "";
	}

	String com7(int q, List<Object> eq, String x, String y, String z) {
		String ans = "";
		eq.add(x);
		eq.add(y);
		eq.add(z);
		for (int i = 0; i < eq.size() - 3; i++) {
			for (int j = 0; j < eq.size(); j++) {
				if (j != i) {
					for (int k = 0; k < eq.size(); k++) {
						if (k != j & k != i) {
							for (int l = 0; l < eq.size(); l++) {
								if (l != k & l != j & l != i) {
									for (int m = 0; m < eq.size(); m++) {
										if (m != l & m != k & m != j & m != i) {
											for (int n = 0; n < eq.size(); n++) {
												if (n != m & n != l & n != k & n != j & n != i) {
													for (int p = 0; p < eq.size() - 3; p++) {
														if (p != n & p != m & p != l & p != k & p != j & p != i) {
															ans = eq.get(i).toString() + eq.get(j).toString()
																	+ eq.get(k).toString() + eq.get(l).toString()
																	+ eq.get(m).toString() + eq.get(n).toString()
																	+ eq.get(p).toString();
															double a = ob1.calculate(ans);
															if (a == q) {
																return ans;
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return "";
	}

	String com8(int q, List<Object> eq, String x, String y, String z) {
		String ans = "";
		eq.add(x);
		eq.add(y);
		eq.add(z);
		for (int i = 0; i < eq.size() - 2; i++) {
			for (int j = 0; j < eq.size(); j++) {
				if (j != i) {
					for (int k = 0; k < eq.size(); k++) {
						if (k != j & k != i) {
							for (int l = 0; l < eq.size(); l++) {
								if (l != k & l != j & l != i) {
									for (int m = 0; m < eq.size(); m++) {
										if (m != l & m != k & m != j & m != i) {
											for (int n = 0; n < eq.size() - 2; n++) {
												if (n != m & n != l & n != k & n != j & n != i) {
													ans = eq.get(i).toString() + eq.get(j).toString()
															+ eq.get(k).toString() + eq.get(l).toString()
															+ eq.get(m).toString() + eq.get(n).toString();
													double a = ob1.calculate(ans);
													if (a == q) {
														return ans;
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return "";
	}
}
