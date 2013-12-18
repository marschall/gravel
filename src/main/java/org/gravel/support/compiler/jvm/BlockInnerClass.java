package org.gravel.support.compiler.jvm;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import org.gravel.support.jvm.NonLocalReturn;
import org.gravel.support.compiler.jvm.JVMDefinedObjectType;
import org.gravel.support.compiler.ast.BlockNode;
import org.gravel.support.compiler.jvm.JVMVariable;
import org.gravel.support.compiler.jvm.JVMMethodType;
import org.gravel.support.compiler.jvm.JVMVoidType;
import org.gravel.support.compiler.jvm.JVMType;

public class BlockInnerClass extends Object implements Cloneable {

	public static BlockInnerClass_Factory factory = new BlockInnerClass_Factory();

	BlockNode _blockNode;

	JVMVariable[] _copiedVariables;

	JVMDefinedObjectType _ownerType;

	public static class BlockInnerClass_Factory extends org.gravel.support.jvm.SmalltalkFactory {

		public BlockInnerClass basicNew() {
			BlockInnerClass newInstance = new BlockInnerClass();
			newInstance.initialize();
			return newInstance;
		}

		public BlockInnerClass ownerType_blockNode_copiedVariables_(final JVMDefinedObjectType _ownerType, final BlockNode _aBlockNode, final JVMVariable[] _anArray) {
			return this.basicNew().initializeOwnerType_blockNode_copiedVariables_(_ownerType, _aBlockNode, _anArray);
		}
	}

	static public BlockInnerClass _ownerType_blockNode_copiedVariables_(Object receiver, final JVMDefinedObjectType _ownerType, final BlockNode _aBlockNode, final JVMVariable[] _anArray) {
		return factory.ownerType_blockNode_copiedVariables_(_ownerType, _aBlockNode, _anArray);
	}

	public BlockNode blockNode() {
		return _blockNode;
	}

	public JVMVariable[] copiedVariables() {
		return _copiedVariables;
	}

	public BlockInnerClass copy() {
		try {
			BlockInnerClass _temp1 = (BlockInnerClass) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public BlockInnerClass_Factory factory() {
		return factory;
	}

	public BlockInnerClass initialize() {
		return this;
	}

	public BlockInnerClass initializeOwnerType_blockNode_copiedVariables_(final JVMDefinedObjectType _aString, final BlockNode _aBlockNode, final JVMVariable[] _anArray) {
		_ownerType = _aString;
		_blockNode = _aBlockNode;
		_copiedVariables = _anArray;
		this.initialize();
		return this;
	}

	public JVMMethodType initSignature() {
		return JVMMethodType.factory.returnType_arguments_(JVMVoidType.factory.basicNew(), org.gravel.support.jvm.ArrayExtensions.collect_(_copiedVariables, ((org.gravel.support.jvm.Block1<JVMType, JVMVariable>) (new org.gravel.support.jvm.Block1<JVMType, JVMVariable>() {

			@Override
			public JVMType value_(final JVMVariable _each) {
				return (JVMType) _each.type();
			}
		}))));
	}

	public JVMDefinedObjectType ownerType() {
		return _ownerType;
	}

	public BlockInnerClass postCopy() {
		return this;
	}
}
