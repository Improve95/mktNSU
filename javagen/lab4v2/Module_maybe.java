// HASH COLLISIONS: YES
// timestamp: 1727630302000

package lab4v2;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final public class Module_maybe {
	public static final Object f_either(Struct am, Object aalternative) {
		Struct l0__tmp = am;
		switch (l0__tmp.getTypeId()) {
		case 5/*None*/: {
			return aalternative;
		}
		case 10/*Some*/: {
			final Struct_Some l1__tmp = (Struct_Some)l0__tmp;
			final Object l2_v = l1__tmp.f_value;
			final Object l3_v = (l1__tmp).f_value;
			return l3_v;
		}
		default:
			throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
		}
	}
}
