package org.gravel.support.compiler.ast;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import org.gravel.support.jvm.NonLocalReturn;
import org.gravel.support.compiler.ast.Node;
import org.gravel.support.compiler.ast.Node.Node_Factory;
import org.gravel.support.compiler.ast.MethodNode;
import org.gravel.support.compiler.ast.VariableDeclarationNode;
import org.gravel.support.compiler.ast.MetaclassNode;
import org.gravel.support.compiler.ast.TraitUsageNode;
import org.gravel.support.compiler.ast.SystemNode;
import org.gravel.support.compiler.ast.BoundVariableDeclarationNode;
import org.gravel.support.compiler.ast.UpdateClassDescriptorDiff;
import org.gravel.support.compiler.ast.SourceFile;
import org.gravel.support.compiler.ast.Reference;
import org.gravel.support.compiler.ast.SourcePrinter;
import org.gravel.support.compiler.ast.SourcePosition;

abstract public class ClassDescriptionNode extends Node implements Cloneable {

	public static ClassDescriptionNode_Factory factory = new ClassDescriptionNode_Factory();

	VariableDeclarationNode[] _instVars;

	MethodNode[] _methods;

	TraitUsageNode _traitUsage;

	public static class ClassDescriptionNode_Factory extends Node_Factory {

		public ClassDescriptionNode basicNew() {
			throw new RuntimeException("ClassDescriptionNode is an abstract class");
		}

		public MetaclassNode methods_instVars_(final MethodNode[] _anOrderedCollection, final VariableDeclarationNode[] _anArray) {
			return ((MetaclassNode) this.basicNew().initializeMethods_instVars_(_anOrderedCollection, _anArray));
		}
	}

	static public MetaclassNode _methods_instVars_(Object receiver, final MethodNode[] _anOrderedCollection, final VariableDeclarationNode[] _anArray) {
		return factory.methods_instVars_(_anOrderedCollection, _anArray);
	}

	public ClassDescriptionNode allMethodsIn_do_(final SystemNode _aSystemNode, final org.gravel.support.jvm.Block1<Object, MethodNode> _aBlock) {
		final ClassDescriptionNode _scn;
		for (final MethodNode _temp1 : _methods) {
			_aBlock.value_(_temp1);
		}
		_scn = this.superclassNodeIn_(_aSystemNode);
		if (_scn == null) {
			return ClassDescriptionNode.this;
		}
		_scn.allMethodsIn_do_(_aSystemNode, _aBlock);
		return this;
	}

	@Override
	public ClassDescriptionNode allNodesDo_(final org.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		this.nodesDo_(new org.gravel.support.jvm.Block1<Object, Node>() {

			@Override
			public Object value_(final Node _each) {
				return _each.withAllNodesDo_(_aBlock);
			}
		});
		return this;
	}

	@Override
	public ClassDescriptionNode allNodesDo_pruneWhere_(final org.gravel.support.jvm.Block1<Object, Node> _aBlock, final org.gravel.support.jvm.Block1<Boolean, Node> _pruneBlock) {
		this.nodesDo_(new org.gravel.support.jvm.Block1<Object, Node>() {

			@Override
			public Object value_(final Node _each) {
				if (!_pruneBlock.value_(_each)) {
					return _each.withAllNodesDo_pruneWhere_(_aBlock, _pruneBlock);
				}
				return ClassDescriptionNode.this;
			}
		});
		return this;
	}

	public BoundVariableDeclarationNode[] boundInstVars() {
		return org.gravel.support.jvm.ArrayExtensions.collect_(_instVars, ((org.gravel.support.jvm.Block1<BoundVariableDeclarationNode, VariableDeclarationNode>) (new org.gravel.support.jvm.Block1<BoundVariableDeclarationNode, VariableDeclarationNode>() {

			@Override
			public BoundVariableDeclarationNode value_(final VariableDeclarationNode _each) {
				return (BoundVariableDeclarationNode) _each.withOwnerType_(ClassDescriptionNode.this.reference());
			}
		})));
	}

	public boolean canUnderstand_in_(final String _selector, final SystemNode _aSystemNode) {
		final ClassDescriptionNode _scn;
		if (this.includesSelector_(_selector)) {
			return true;
		}
		_scn = this.superclassNodeIn_(_aSystemNode);
		if (_scn == null) {
			return false;
		}
		return _scn.canUnderstand_in_(_selector, _aSystemNode);
	}

	public ClassDescriptionNode copy() {
		try {
			ClassDescriptionNode _temp1 = (ClassDescriptionNode) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public ClassDescriptionNode copyRemoveSelector_(final String _selector) {
		return this.copy().pvtSetMethods_(org.gravel.support.jvm.ArrayExtensions.reject_(_methods, new org.gravel.support.jvm.Predicate1<MethodNode>() {

			@Override
			public boolean value_(final MethodNode _each) {
				return org.gravel.support.jvm.StringExtensions.equals_(_each.selector(), _selector);
			}
		}));
	}

	public ClassDescriptionNode copyReplaceMethodNode_(final MethodNode _aMethodNode) {
		return this.copy().pvtSetMethods_(org.gravel.support.jvm.ArrayExtensions.collect_(_methods, ((org.gravel.support.jvm.Block1<MethodNode, MethodNode>) (new org.gravel.support.jvm.Block1<MethodNode, MethodNode>() {

			@Override
			public MethodNode value_(final MethodNode _each) {
				if (org.gravel.support.jvm.StringExtensions.equals_(_each.selector(), _aMethodNode.selector())) {
					return _aMethodNode;
				} else {
					return _each;
				}
			}
		}))));
	}

	public UpdateClassDescriptorDiff diffToClassDescriptionNode_(final ClassDescriptionNode _aClassDescriptionNode) {
		final UpdateClassDescriptorDiff[] _diff;
		_diff = new UpdateClassDescriptorDiff[1];
		_diff[0] = UpdateClassDescriptorDiff.factory.empty();
		org.gravel.support.jvm.ArrayExtensions.syncWith(_instVars, _aClassDescriptionNode.instVars(), new org.gravel.support.jvm.Predicate2<VariableDeclarationNode, VariableDeclarationNode>() {

			@Override
			public boolean value_value_(final VariableDeclarationNode _a, final VariableDeclarationNode _b) {
				return org.gravel.support.jvm.StringExtensions.equals_(_a.name(), _b.name());
			}
		}, new org.gravel.support.jvm.Block2<Object, VariableDeclarationNode, VariableDeclarationNode>() {

			@Override
			public Object value_value_(final VariableDeclarationNode _a, final VariableDeclarationNode _b) {
				if (!org.gravel.support.jvm.ObjectExtensions.equals_(_a, _b)) {
					return org.gravel.support.jvm.ObjectExtensions.halt(ClassDescriptionNode.this);
				}
				return ClassDescriptionNode.this;
			}
		}, new org.gravel.support.jvm.Block1<Object, VariableDeclarationNode>() {

			@Override
			public Object value_(final VariableDeclarationNode _instVar) {
				return org.gravel.support.jvm.ObjectExtensions.halt(ClassDescriptionNode.this);
			}
		}, new org.gravel.support.jvm.Block1<Object, VariableDeclarationNode>() {

			@Override
			public Object value_(final VariableDeclarationNode _instVar) {
				return org.gravel.support.jvm.ObjectExtensions.halt(ClassDescriptionNode.this);
			}
		});
		org.gravel.support.jvm.ArrayExtensions.syncWith(_methods, _aClassDescriptionNode.methods(), new org.gravel.support.jvm.Predicate2<MethodNode, MethodNode>() {

			@Override
			public boolean value_value_(final MethodNode _a, final MethodNode _b) {
				return org.gravel.support.jvm.StringExtensions.equals_(_a.selector(), _b.selector());
			}
		}, new org.gravel.support.jvm.Block2<Object, MethodNode, MethodNode>() {

			@Override
			public Object value_value_(final MethodNode _a, final MethodNode _b) {
				if (!org.gravel.support.jvm.ObjectExtensions.equals_(_a, _b)) {
					return _diff[0] = _diff[0].withUpdateMethodNode_(_b);
				}
				return ClassDescriptionNode.this;
			}
		}, new org.gravel.support.jvm.Block1<Object, MethodNode>() {

			@Override
			public Object value_(final MethodNode _methodNode) {
				return _diff[0] = _diff[0].withAddMethodNode_(_methodNode);
			}
		}, new org.gravel.support.jvm.Block1<Object, MethodNode>() {

			@Override
			public Object value_(final MethodNode _methodNode) {
				return _diff[0] = _diff[0].withDeletedSelector_(_methodNode.selector());
			}
		});
		return _diff[0];
	}

	@Override
	public boolean equals(final Object _anObject) {
		if (!super.equals(_anObject)) {
			return false;
		}
		if (this._methods == null) {
			if (!(((ClassDescriptionNode) _anObject)._methods == null)) {
				return false;
			}
		} else {
			if (!org.gravel.support.jvm.ArrayExtensions.equals_(this._methods, ((ClassDescriptionNode) _anObject)._methods)) {
				return false;
			}
		}
		if (this._instVars == null) {
			if (!(((ClassDescriptionNode) _anObject)._instVars == null)) {
				return false;
			}
		} else {
			if (!org.gravel.support.jvm.ArrayExtensions.equals_(this._instVars, ((ClassDescriptionNode) _anObject)._instVars)) {
				return false;
			}
		}
		if (this._traitUsage == null) {
			if (!(((ClassDescriptionNode) _anObject)._traitUsage == null)) {
				return false;
			}
		} else {
			if (!org.gravel.support.jvm.ObjectExtensions.equals_(this._traitUsage, ((ClassDescriptionNode) _anObject)._traitUsage)) {
				return false;
			}
		}
		return true;
	}

	public ClassDescriptionNode_Factory factory() {
		return factory;
	}

	public abstract SourceFile findSourceFile();

	public abstract ClassDescriptionNode flattenTraitsIn_(final SystemNode _aSystemNode);

	@Override
	public int hashCode() {
		return (((this.factory() == null ? 0 : this.factory().hashCode()) ^ java.util.Arrays.hashCode(_methods)) ^ java.util.Arrays.hashCode(_instVars));
	}

	public boolean includesSelector_(final String _selector) {
		return org.gravel.support.jvm.ArrayExtensions.anySatisfy_(_methods, new org.gravel.support.jvm.Predicate1<MethodNode>() {

			@Override
			public boolean value_(final MethodNode _each) {
				return org.gravel.support.jvm.StringExtensions.equals_(_each.selector(), _selector);
			}
		});
	}

	public ClassDescriptionNode initializeMethods_instVars_(final MethodNode[] _anOrderedCollection, final VariableDeclarationNode[] _anArray) {
		_methods = _anOrderedCollection;
		_instVars = _anArray;
		this.initialize();
		return this;
	}

	public VariableDeclarationNode[] instVars() {
		return _instVars;
	}

	public boolean isClassNode() {
		return false;
	}

	public boolean isMeta() {
		return false;
	}

	public abstract boolean isNilClass();

	public abstract boolean isTrait();

	@Override
	public ClassDescriptionNode localVarNamesDo_(final org.gravel.support.jvm.Block1<Object, String> _aBlock) {
		return this;
	}

	public abstract MetaclassNode meta();

	public MethodNode methodAt_(final String _selector) {
		return ((MethodNode) org.gravel.support.jvm.ArrayExtensions.detect_ifNone_(_methods, new org.gravel.support.jvm.Predicate1<MethodNode>() {

			@Override
			public boolean value_(final MethodNode _each) {
				return org.gravel.support.jvm.StringExtensions.equals_(_each.selector(), _selector);
			}
		}, ((org.gravel.support.jvm.Block0<MethodNode>) (new org.gravel.support.jvm.Block0<MethodNode>() {

			@Override
			public MethodNode value() {
				throw new RuntimeException("Method " + _selector + " not found");
			}
		}))));
	}

	public MethodNode methodAt_ifAbsent_(final String _selector, final org.gravel.support.jvm.Block0<MethodNode> _aBlock) {
		return org.gravel.support.jvm.ArrayExtensions.detect_ifNone_(_methods, new org.gravel.support.jvm.Predicate1<MethodNode>() {

			@Override
			public boolean value_(final MethodNode _each) {
				return org.gravel.support.jvm.StringExtensions.equals_(_each.selector(), _selector);
			}
		}, _aBlock);
	}

	public MethodNode methodOrNilAt_(final String _selector) {
		return ((MethodNode) org.gravel.support.jvm.ArrayExtensions.detect_ifNone_(_methods, new org.gravel.support.jvm.Predicate1<MethodNode>() {

			@Override
			public boolean value_(final MethodNode _each) {
				return org.gravel.support.jvm.StringExtensions.equals_(_each.selector(), _selector);
			}
		}, ((org.gravel.support.jvm.Block0<MethodNode>) (new org.gravel.support.jvm.Block0<MethodNode>() {

			@Override
			public MethodNode value() {
				return (MethodNode) null;
			}
		}))));
	}

	public MethodNode[] methods() {
		return _methods;
	}

	public org.gravel.core.Symbol name() {
		return null;
	}

	public abstract org.gravel.core.Symbol[] namespace();

	@Override
	public ClassDescriptionNode nodesDo_(final org.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		for (final MethodNode _temp1 : _methods) {
			_aBlock.value_(_temp1);
		}
		for (final VariableDeclarationNode _temp2 : _instVars) {
			_aBlock.value_(_temp2);
		}
		return this;
	}

	@Override
	public ClassDescriptionNode prettySourceOn_(final StringBuilder _aStream) {
		SourcePrinter.factory.on_(_aStream).visit_(this);
		return this;
	}

	@Override
	public ClassDescriptionNode printOn_(final StringBuilder _aStream) {
		final String _title;
		_title = this.factory().toString();
		_aStream.append(org.gravel.support.jvm.CharacterExtensions.isVowel(_title.charAt(0)) ? "an " : "a ");
		_aStream.append(_title);
		_aStream.append('[');
		this.sourceOn_(_aStream);
		_aStream.append(']');
		return this;
	}

	public ClassDescriptionNode pvtSetInstVars_(final VariableDeclarationNode[] _arr) {
		_instVars = _arr;
		return this;
	}

	public ClassDescriptionNode pvtSetMethods_(final MethodNode[] _anArray) {
		_methods = _anArray;
		return this;
	}

	@Override
	public ClassDescriptionNode pvtSetSourcePosition_(final SourcePosition _aSourcePosition) {
		_sourcePosition = _aSourcePosition;
		return this;
	}

	public ClassDescriptionNode pvtSetTraitUsage_(final TraitUsageNode _aTraitUsageNode) {
		_traitUsage = _aTraitUsageNode;
		return this;
	}

	public abstract Reference reference();

	public ClassDescriptionNode selectorsDo_(final org.gravel.support.jvm.Block1<Object, String> _aBlock) {
		for (final MethodNode _m : _methods) {
			_aBlock.value_(_m.selector());
		}
		return this;
	}

	@Override
	public abstract ClassDescriptionNode sourceOn_(final StringBuilder _aStream);

	public ClassDescriptionNode superclassNodeIn_(final SystemNode _aSystemNode) {
		final Reference _scr;
		_scr = this.superclassReference();
		if (_scr == null) {
			return null;
		}
		return _aSystemNode.classNodeAt_(_scr);
	}

	public abstract Reference superclassReference();

	public Reference superclassReferenceForMethodLookup() {
		return this.superclassReference();
	}

	public TraitUsageNode traitUsage() {
		return _traitUsage;
	}

	@Override
	public ClassDescriptionNode withAllNodesDo_(final org.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		_aBlock.value_(this);
		this.allNodesDo_(_aBlock);
		return this;
	}

	@Override
	public ClassDescriptionNode withAllNodesDo_pruneWhere_(final org.gravel.support.jvm.Block1<Object, Node> _aBlock, final org.gravel.support.jvm.Block1<Boolean, Node> _pruneBlock) {
		_aBlock.value_(this);
		this.allNodesDo_pruneWhere_(_aBlock, _pruneBlock);
		return this;
	}

	public ClassDescriptionNode withExtraMethods_(final MethodNode[] _extraMethods) {
		return org.gravel.support.jvm.ArrayExtensions.inject_into_(_extraMethods, this, ((org.gravel.support.jvm.Block2<ClassDescriptionNode, ClassDescriptionNode, MethodNode>) (new org.gravel.support.jvm.Block2<ClassDescriptionNode, ClassDescriptionNode, MethodNode>() {

			@Override
			public ClassDescriptionNode value_value_(final ClassDescriptionNode _cdn, final MethodNode _m) {
				if (_cdn.includesSelector_(_m.selector())) {
					return _cdn;
				} else {
					return _cdn.withMethodNode_(_m);
				}
			}
		})));
	}

	public ClassDescriptionNode withInstVar_(final VariableDeclarationNode _aVariableDeclarationNode) {
		return this.copy().pvtSetInstVars_(org.gravel.support.jvm.ArrayExtensions.copyWith_(_instVars, _aVariableDeclarationNode));
	}

	public ClassDescriptionNode withMethodNode_(final MethodNode _aMethodNode) {
		final MethodNode _current;
		_current = this.methodOrNilAt_(_aMethodNode.selector());
		if (_current != null) {
			throw new RuntimeException("Duplicate selector: " + _aMethodNode.selector());
		}
		return this.copy().pvtSetMethods_(org.gravel.support.jvm.ArrayExtensions.copyWith_(_methods, _aMethodNode));
	}

	public ClassDescriptionNode withMethodNode_ofTrait_(final MethodNode _aMethodNode, final Reference _aReference) {
		return this.withMethodNode_(_aMethodNode.ofTrait_(_aReference));
	}

	public ClassDescriptionNode withMethods_(final MethodNode[] _anArray) {
		return this.copy().pvtSetMethods_(_anArray);
	}

	@Override
	public ClassDescriptionNode withSourcePosition_(final SourcePosition _aSourcePosition) {
		if (_sourcePosition == _aSourcePosition) {
			return ClassDescriptionNode.this;
		}
		return this.copy().pvtSetSourcePosition_(_aSourcePosition);
	}

	public ClassDescriptionNode withTrait_(final TraitUsageNode _aTraitUsageNode) {
		return this.copy().pvtSetTraitUsage_(_traitUsage.withTrait_(_aTraitUsageNode));
	}
}
