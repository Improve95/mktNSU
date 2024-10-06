// HASH COLLISIONS: YES
// timestamp: 1728197547639

package lab4v2;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
public final class lab4v2 extends FlowRuntime {

	// Init hosts: 1
	private static final void init_hosts() {
		FlowRuntime.registerNativeHost(Native.class);
	}

	// Init modules: 3
	private static final void init_modules() {
		Module_url.init();
		Module_securitymode.init();
		Module_runtime.init();
	}
	private static final void init() {
		Structs.init();
		init_hosts();
		init_modules();
	}
	protected void main() {
		init();
		Module_lab4v2.f_main();
	}
	public static void main(String[] args) {
		FlowRuntime.program_args = args;
		lab4v2 runner = new lab4v2();
		runner.start();
	}
}
