package org.gravel.support.compiler.ast;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import org.gravel.support.jvm.NonLocalReturn;
import org.gravel.support.compiler.ast.AbstractVariableRenamer;
import org.gravel.support.compiler.ast.AbstractVariableRenamer.AbstractVariableRenamer_Factory;
import java.util.HashSet;

public class VariableRenamer extends AbstractVariableRenamer implements Cloneable {

	public static VariableRenamer_Factory factory = new VariableRenamer_Factory();

	public static class VariableRenamer_Factory extends AbstractVariableRenamer_Factory {

		public VariableRenamer basicNew() {
			VariableRenamer newInstance = new VariableRenamer();
			newInstance.initialize();
			return newInstance;
		}

		@Override
		public VariableRenamer oldName_newName_(final String _aString, final String _aString2) {
			return ((VariableRenamer) this.basicNew().initializeOldName_newName_(_aString, _aString2));
		}
	}

	static public VariableRenamer _oldName_newName_(Object receiver, final String _aString, final String _aString2) {
		return factory.oldName_newName_(_aString, _aString2);
	}

	@Override
	public VariableRenamer addLocalName_(final String _name) {
		_localNames.add(_name);
		return this;
	}

	public VariableRenamer copy() {
		try {
			VariableRenamer _temp1 = (VariableRenamer) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public VariableRenamer_Factory factory() {
		return factory;
	}

	@Override
	public VariableRenamer initialize() {
		super.initialize();
		_localNames = new java.util.HashSet();
		return this;
	}

	@Override
	public VariableRenamer initializeOldName_newName_(final String _aString, final String _aString2) {
		_oldName = _aString;
		_newName = _aString2;
		this.initialize();
		return this;
	}

	@Override
	public VariableRenamer postCopy() {
		super.postCopy();
		_localNames = org.gravel.support.jvm.SetExtensions.copy(_localNames);
		return this;
	}

	@Override
	public String renameDefinition_(final String _aString) {
		return this.rename_(_aString);
	}

	@Override
	public String rename_(final String _aString) {
		if (org.gravel.support.jvm.StringExtensions.equals_(_aString, _oldName)) {
			return _newName;
		}
		return _aString;
	}

	@Override
	public VariableRenamer subconverter() {
		return this.copy();
	}
}
