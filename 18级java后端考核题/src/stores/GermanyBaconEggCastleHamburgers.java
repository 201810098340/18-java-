package stores;

import hamburgers.Hamburgers;
/*
 * 类GermanyBaconEggCastleHamburgers实现接口Hamburgers
 */
public class GermanyBaconEggCastleHamburgers implements Hamburgers {

	@Override
	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("烘烤");

	}

	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("切片");

	}

	@Override
	public void box() {
		// TODO Auto-generated method stub
		System.out.println("打包");

	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("15.5元");

	}

}
