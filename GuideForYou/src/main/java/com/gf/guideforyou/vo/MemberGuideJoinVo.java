package com.gf.guideforyou.vo;

//


public class MemberGuideJoinVo {

	private MemberBasicVo memberBasicVo;
	private Guide_EvaluationBasicVo guide_EvaluationBasicVo;
	
	public MemberGuideJoinVo() {
		super();
	}
	
	public MemberGuideJoinVo(MemberBasicVo memberBasicVo, Guide_EvaluationBasicVo guide_EvaluationBasicVo) {
		super();
		this.memberBasicVo = memberBasicVo;
		this.guide_EvaluationBasicVo = guide_EvaluationBasicVo;
	}
	
	public MemberBasicVo getMemberBasicVo() {
		return memberBasicVo;
	}
	public void setMemberBasicVo(MemberBasicVo memberBasicVo) {
		this.memberBasicVo = memberBasicVo;
	}
	public Guide_EvaluationBasicVo getGuide_EvaluationBasicVo() {
		return guide_EvaluationBasicVo;
	}
	public void setGuide_EvaluationBasicVo(Guide_EvaluationBasicVo guide_EvaluationBasicVo) {
		this.guide_EvaluationBasicVo = guide_EvaluationBasicVo;
	}
	
	
}
