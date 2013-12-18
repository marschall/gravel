package org.gravel.support.compiler.jvm;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import org.gravel.support.jvm.NonLocalReturn;
import org.gravel.support.compiler.jvm.JVMClassCompiler;
import org.gravel.support.compiler.jvm.BlockInnerClass;
import org.gravel.support.compiler.jvm.JVMDefinedObjectType;
import org.gravel.support.compiler.jvm.JVMClass;
import org.gravel.support.compiler.jvm.JVMMethod;
import org.gravel.support.compiler.jvm.JVMField;
import org.gravel.support.compiler.jvm.JVMMethodCompiler;
import org.gravel.support.compiler.jvm.JVMVariable;
import java.util.List;
import org.gravel.support.compiler.jvm.JVMInstruction;
import org.gravel.support.compiler.jvm.Load;
import java.util.ArrayList;
import org.gravel.support.compiler.jvm.PutField;
import org.gravel.support.compiler.jvm.InvokeSpecial;
import org.gravel.support.compiler.jvm.JVMType;
import org.gravel.support.compiler.jvm.Return;
import org.gravel.support.compiler.jvm.JVMLocalDeclaration;

public class JVMBlockCompiler extends Object implements Cloneable {

	public static JVMBlockCompiler_Factory factory = new JVMBlockCompiler_Factory();

	BlockInnerClass _block;

	JVMClassCompiler _parent;

	public static class JVMBlockCompiler_Factory extends org.gravel.support.jvm.SmalltalkFactory {

		public JVMBlockCompiler basicNew() {
			JVMBlockCompiler newInstance = new JVMBlockCompiler();
			newInstance.initialize();
			return newInstance;
		}

		public JVMBlockCompiler parent_block_(final JVMClassCompiler _aJVMClassCompiler, final BlockInnerClass _aBlockInnerClass) {
			return this.basicNew().initializeParent_block_(_aJVMClassCompiler, _aBlockInnerClass);
		}
	}

	static public JVMBlockCompiler _parent_block_(Object receiver, final JVMClassCompiler _aJVMClassCompiler, final BlockInnerClass _aBlockInnerClass) {
		return factory.parent_block_(_aJVMClassCompiler, _aBlockInnerClass);
	}

	public BlockInnerClass block() {
		return _block;
	}

	public JVMDefinedObjectType blockSuperType_(final int _anInteger) {
		return JVMDefinedObjectType.factory.className_("org/gravel/support/jvm/Block" + "" + _anInteger);
	}

	public JVMClass compileBlock() {
		final JVMMethod _m;
		final JVMField[] _fields;
		final JVMMethodCompiler _methodCompiler;
		final JVMClass _jvmClass;
		_fields = org.gravel.support.jvm.ArrayExtensions.collect_(_block.copiedVariables(), ((org.gravel.support.jvm.Block1<JVMField, JVMVariable>) (new org.gravel.support.jvm.Block1<JVMField, JVMVariable>() {

			@Override
			public JVMField value_(final JVMVariable _each) {
				return (JVMField) _each.asField_isStatic_(_block.ownerType(), false);
			}
		})));
		_methodCompiler = JVMMethodCompiler.factory.parent_(_parent);
		_methodCompiler.isStatic_(false);
		_m = _methodCompiler.buildBlock_copiedVariables_blockType_(_block.blockNode(), _fields, _block.ownerType());
		_jvmClass = JVMClass.factory.type_superType_fields_methods_(_block.ownerType(), this.superType(), _fields, org.gravel.support.jvm.ArrayFactory.with_with_(_m, this.createInit()));
		if (_block.blockNode().sourcePosition() != null) {
			_jvmClass.source_(_block.blockNode().sourcePosition().sourceFile().name());
		}
		return _jvmClass;
	}

	public JVMBlockCompiler copy() {
		try {
			JVMBlockCompiler _temp1 = (JVMBlockCompiler) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public JVMMethod createInit() {
		final List<JVMInstruction> _instructions;
		final Load _read0;
		_instructions = new java.util.ArrayList();
		_read0 = Load.factory.index_type_(0, _block.ownerType());
		for (int _temp1 = 0; _temp1 < _block.copiedVariables().length; _temp1++) {
			final int _i = _temp1 + 1;
			final JVMVariable _elem = _block.copiedVariables()[_temp1];
			_instructions.add(_read0);
			_instructions.add(Load.factory.index_type_(_i, _elem.type()));
			_instructions.add(PutField.factory.ownerType_name_type_(_block.ownerType(), _elem.varName(), _elem.type()));
		}
		_instructions.add(_read0);
		_instructions.add(InvokeSpecial.factory.init_voidArguments_(this.superType(), new JVMType[] {}));
		_instructions.add(Return.factory.basicNew());
		return JVMMethod.factory.name_locals_instructions_isStatic_signature_("<init>", new JVMLocalDeclaration[] {}, _instructions.toArray(new JVMInstruction[_instructions.size()]), false, _block.initSignature());
	}

	public JVMBlockCompiler_Factory factory() {
		return factory;
	}

	public JVMBlockCompiler initialize() {
		return this;
	}

	public JVMBlockCompiler initializeParent_block_(final JVMClassCompiler _aJVMClassCompiler, final BlockInnerClass _aBlockInnerClass) {
		_parent = _aJVMClassCompiler;
		_block = _aBlockInnerClass;
		this.initialize();
		return this;
	}

	public JVMClassCompiler parent() {
		return _parent;
	}

	public JVMBlockCompiler postCopy() {
		return this;
	}

	public JVMDefinedObjectType superType() {
		return this.blockSuperType_(_block.blockNode().numArgs());
	}
}
