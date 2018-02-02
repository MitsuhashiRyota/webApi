package jp.co.internous.lab.application.constants;

public final class  Const {

	// コンストラクタ
	private Const() {}

	/**
	 * Repositoryで利用
	 * @author MitsuhashiRyota
	 *
	 */
	public static class SQL {
		public static final String T_USER_INFO_GET_NAME = "SELECT * FROM t_user_info WHERE user_first_name_kana LIKE %?1% OR user_last_name_kana LIKE %?2% OR user_first_name LIKE %?3% OR user_last_name LIKE %?4%";
	}
}
