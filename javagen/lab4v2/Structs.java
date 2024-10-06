// HASH COLLISIONS: YES
// timestamp: 1728197547640

package lab4v2;

import com.area9innovation.flow.*;

import java.util.concurrent.ConcurrentHashMap;

@SuppressWarnings("unchecked")
public final class Structs {

	// Structs array
	static final private Struct[] struct_list = {
		new Struct_Cons(),
		SingletonStructs.str_EmptyList,
		SingletonStructs.str_EmptyPopResult,
		SingletonStructs.str_IllegalStruct,
		new Struct_KeyValue(),
		SingletonStructs.str_None,
		new Struct_OWASP(),
		new Struct_Pair(),
		new Struct_PopResult(),
		new Struct_Quadruple(),
		new Struct_Some(),
		SingletonStructs.str_TreeEmpty,
		new Struct_TreeNode(),
		new Struct_Triple(),
		new Struct_VerboseOutput()
	};
	public static final void init() {
		FlowRuntime.struct_prototypes = struct_list;
		for (int i = 0; i < FlowRuntime.struct_prototypes.length; i++) {
			FlowRuntime.struct_ids.put(FlowRuntime.struct_prototypes[i].getTypeName(), i);
		}
	}
}
