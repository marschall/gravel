(reader defineClass: 'CrossTypeArithmeticTest' superclass: 'st.gravel.sunit.TestCase')
!
(reader propertyAt: 'isSystemTest' put: 'Ja')
!
(reader addMethod: 'tests')
!
test_big_backslashbackslash_big
	| value |
	value := 251172765292171600923361522612285166173
				\\ 251172765292171600923361522612285166173.
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_big_backslashbackslash_fixed
	| value |
	value := 251172765292171600923361522612285166173 \\ 2.5s.
	self assert: value equals: 0.5s
!
(reader addMethod: 'tests')
!
test_big_backslashbackslash_float
	| value |
	value := 251172765292171600923361522612285166173 \\ 7.5.
	self assert: value equals: 0.0
!
(reader addMethod: 'tests')
!
test_big_backslashbackslash_fraction
	| value |
	value := 251172765292171600923361522612285166173 \\ (2 / 3).
	self assert: value equals: 1 / 3
!
(reader addMethod: 'tests')
!
test_big_backslashbackslash_int
	| value |
	value := 251172765292171600923361522612285166173 \\ 7.
	self assert: value equals: 5
!
(reader addMethod: 'tests')
!
test_big_minus_big
	| value |
	value := 251172765292171600923361522612285166173
				- 251172765292171600923361522612285166173.
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_big_minus_fixed
	| value |
	value := 251172765292171600923361522612285166173 - 2.5s.
	self assert: value equals: 251172765292171600923361522612285166170.5s
!
(reader addMethod: 'tests')
!
test_big_minus_float
	| value |
	value := 251172765292171600923361522612285166173 - 7.5.
	self assert: value equals: 2.51173e38 delta: 4.46213e32
!
(reader addMethod: 'tests')
!
test_big_minus_fraction
	| value |
	value := 251172765292171600923361522612285166173 - (2 / 3).
	self assert: value equals: 753518295876514802770084567836855498517 / 3
!
(reader addMethod: 'tests')
!
test_big_minus_int
	| value |
	value := 251172765292171600923361522612285166173 - 7.
	self assert: value equals: 251172765292171600923361522612285166166
!
(reader addMethod: 'tests')
!
test_big_minus_zero
	| value |
	value := 251172765292171600923361522612285166173 - 0.
	self assert: value equals: 251172765292171600923361522612285166173
!
(reader addMethod: 'tests')
!
test_big_plus_big
	| value |
	value := 251172765292171600923361522612285166173
				+ 251172765292171600923361522612285166173.
	self assert: value equals: 502345530584343201846723045224570332346
!
(reader addMethod: 'tests')
!
test_big_plus_fixed
	| value |
	value := 251172765292171600923361522612285166173 + 2.5s.
	self assert: value equals: 251172765292171600923361522612285166175.5s
!
(reader addMethod: 'tests')
!
test_big_plus_float
	| value |
	value := 251172765292171600923361522612285166173 + 7.5.
	self assert: value equals: 2.51173e38 delta: 4.46213e32
!
(reader addMethod: 'tests')
!
test_big_plus_fraction
	| value |
	value := 251172765292171600923361522612285166173 + (2 / 3).
	self assert: value equals: 753518295876514802770084567836855498521 / 3
!
(reader addMethod: 'tests')
!
test_big_plus_int
	| value |
	value := 251172765292171600923361522612285166173 + 7.
	self assert: value equals: 251172765292171600923361522612285166180
!
(reader addMethod: 'tests')
!
test_big_plus_zero
	| value |
	value := 251172765292171600923361522612285166173 + 0.
	self assert: value equals: 251172765292171600923361522612285166173
!
(reader addMethod: 'tests')
!
test_big_quo__big
	| value |
	value := 251172765292171600923361522612285166173
				quo: 251172765292171600923361522612285166173.
	self assert: value equals: 1
!
(reader addMethod: 'tests')
!
test_big_quo__fixed
	| value |
	value := 251172765292171600923361522612285166173 quo: 2.5s.
	self assert: value equals: 100469106116868640369344609044914066469
!
(reader addMethod: 'tests')
!
test_big_quo__float
	| value |
	value := 251172765292171600923361522612285166173 quo: 7.5.
	self assert: value equals: 33489701194659127740991376919118217216
!
(reader addMethod: 'tests')
!
test_big_quo__fraction
	| value |
	value := 251172765292171600923361522612285166173 quo: 2 / 3.
	self assert: value equals: 376759147938257401385042283918427749259
!
(reader addMethod: 'tests')
!
test_big_quo__int
	| value |
	value := 251172765292171600923361522612285166173 quo: 7.
	self assert: value equals: 35881823613167371560480217516040738024
!
(reader addMethod: 'tests')
!
test_big_rem__big
	| value |
	value := 251172765292171600923361522612285166173
				rem: 251172765292171600923361522612285166173.
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_big_rem__fixed
	| value |
	value := 251172765292171600923361522612285166173 rem: 2.5s.
	self assert: value equals: 0.5s
!
(reader addMethod: 'tests')
!
test_big_rem__float
	| value |
	value := 251172765292171600923361522612285166173 rem: 7.5.
	self assert: value equals: 0.0
!
(reader addMethod: 'tests')
!
test_big_rem__fraction
	| value |
	value := 251172765292171600923361522612285166173 rem: 2 / 3.
	self assert: value equals: 1 / 3
!
(reader addMethod: 'tests')
!
test_big_rem__int
	| value |
	value := 251172765292171600923361522612285166173 rem: 7.
	self assert: value equals: 5
!
(reader addMethod: 'tests')
!
test_big_slashslash_big
	| value |
	value := 251172765292171600923361522612285166173
				// 251172765292171600923361522612285166173.
	self assert: value equals: 1
!
(reader addMethod: 'tests')
!
test_big_slashslash_fixed
	| value |
	value := 251172765292171600923361522612285166173 // 2.5s.
	self assert: value equals: 100469106116868640369344609044914066469
!
(reader addMethod: 'tests')
!
test_big_slashslash_float
	| value |
	value := 251172765292171600923361522612285166173 // 7.5.
	self assert: value equals: 33489701194659127740991376919118217216
!
(reader addMethod: 'tests')
!
test_big_slashslash_fraction
	| value |
	value := 251172765292171600923361522612285166173 // (2 / 3).
	self assert: value equals: 376759147938257401385042283918427749259
!
(reader addMethod: 'tests')
!
test_big_slashslash_int
	| value |
	value := 251172765292171600923361522612285166173 // 7.
	self assert: value equals: 35881823613167371560480217516040738024
!
(reader addMethod: 'tests')
!
test_big_times_big
	| value |
	value := 251172765292171600923361522612285166173
				* 251172765292171600923361522612285166173.
	self assert: value
		equals: 63087758024516322802158777844395404045045331444940183845941515327498223465929
!
(reader addMethod: 'tests')
!
test_big_times_fixed
	| value |
	value := 251172765292171600923361522612285166173 * 2.5s.
	self assert: value equals: 627931913230429002308403806530712915432.5s
!
(reader addMethod: 'tests')
!
test_big_times_fraction
	| value |
	value := 251172765292171600923361522612285166173 * (2 / 3).
	self assert: value equals: 502345530584343201846723045224570332346 / 3
!
(reader addMethod: 'tests')
!
test_big_times_int
	| value |
	value := 251172765292171600923361522612285166173 * 7.
	self assert: value equals: 1758209357045201206463530658285996163211
!
(reader addMethod: 'tests')
!
test_big_times_zero
	| value |
	value := 251172765292171600923361522612285166173 * 0.
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_fixed_backslashbackslash_big
	| value |
	value := 2.5s \\ 251172765292171600923361522612285166173.
	self assert: value equals: 2.5s
!
(reader addMethod: 'tests')
!
test_fixed_backslashbackslash_fixed
	| value |
	value := 2.5s \\ 2.5s.
	self assert: value equals: 0.0s
!
(reader addMethod: 'tests')
!
test_fixed_backslashbackslash_float
	| value |
	value := 2.5s \\ 7.5.
	self assert: value equals: 2.5
!
(reader addMethod: 'tests')
!
test_fixed_backslashbackslash_fraction
	| value |
	value := 2.5s \\ (2 / 3).
	self assert: value equals: 0.5s
!
(reader addMethod: 'tests')
!
test_fixed_backslashbackslash_int
	| value |
	value := 2.5s \\ 7.
	self assert: value equals: 2.5s
!
(reader addMethod: 'tests')
!
test_fixed_minus_big
	| value |
	value := 2.5s - 251172765292171600923361522612285166173.
	self assert: value equals: -251172765292171600923361522612285166170.5s
!
(reader addMethod: 'tests')
!
test_fixed_minus_fixed
	| value |
	value := 2.5s - 2.5s.
	self assert: value equals: 0.0s
!
(reader addMethod: 'tests')
!
test_fixed_minus_float
	| value |
	value := 2.5s - 7.5.
	self assert: value equals: -5.0
!
(reader addMethod: 'tests')
!
test_fixed_minus_fraction
	| value |
	value := 2.5s - (2 / 3).
	self assert: value equals: 1.8s delta: 0.0666667
!
(reader addMethod: 'tests')
!
test_fixed_minus_int
	| value |
	value := 2.5s - 7.
	self assert: value equals: -4.5s
!
(reader addMethod: 'tests')
!
test_fixed_minus_zero
	| value |
	value := 2.5s - 0.
	self assert: value equals: 2.5s
!
(reader addMethod: 'tests')
!
test_fixed_plus_big
	| value |
	value := 2.5s + 251172765292171600923361522612285166173.
	self assert: value equals: 251172765292171600923361522612285166175.5s
!
(reader addMethod: 'tests')
!
test_fixed_plus_fixed
	| value |
	value := 2.5s + 2.5s.
	self assert: value equals: 5.0s
!
(reader addMethod: 'tests')
!
test_fixed_plus_float
	| value |
	value := 2.5s + 7.5.
	self assert: value equals: 10.0
!
(reader addMethod: 'tests')
!
test_fixed_plus_fraction
	| value |
	value := 2.5s + (2 / 3).
	self assert: value equals: 3.2s delta: 0.0666667
!
(reader addMethod: 'tests')
!
test_fixed_plus_int
	| value |
	value := 2.5s + 7.
	self assert: value equals: 9.5s
!
(reader addMethod: 'tests')
!
test_fixed_plus_zero
	| value |
	value := 2.5s + 0.
	self assert: value equals: 2.5s
!
(reader addMethod: 'tests')
!
test_fixed_quo__big
	| value |
	value := 2.5s quo: 251172765292171600923361522612285166173.
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_fixed_quo__fixed
	| value |
	value := 2.5s quo: 2.5s.
	self assert: value equals: 1
!
(reader addMethod: 'tests')
!
test_fixed_quo__float
	| value |
	value := 2.5s quo: 7.5.
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_fixed_quo__fraction
	| value |
	value := 2.5s quo: 2 / 3.
	self assert: value equals: 3
!
(reader addMethod: 'tests')
!
test_fixed_quo__int
	| value |
	value := 2.5s quo: 7.
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_fixed_rem__big
	| value |
	value := 2.5s rem: 251172765292171600923361522612285166173.
	self assert: value equals: 2.5s
!
(reader addMethod: 'tests')
!
test_fixed_rem__fixed
	| value |
	value := 2.5s rem: 2.5s.
	self assert: value equals: 0.0s
!
(reader addMethod: 'tests')
!
test_fixed_rem__float
	| value |
	value := 2.5s rem: 7.5.
	self assert: value equals: 2.5
!
(reader addMethod: 'tests')
!
test_fixed_rem__fraction
	| value |
	value := 2.5s rem: 2 / 3.
	self assert: value equals: 0.5s
!
(reader addMethod: 'tests')
!
test_fixed_rem__int
	| value |
	value := 2.5s rem: 7.
	self assert: value equals: 2.5s
!
(reader addMethod: 'tests')
!
test_fixed_slashslash_big
	| value |
	value := 2.5s // 251172765292171600923361522612285166173.
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_fixed_slashslash_fixed
	| value |
	value := 2.5s // 2.5s.
	self assert: value equals: 1
!
(reader addMethod: 'tests')
!
test_fixed_slashslash_float
	| value |
	value := 2.5s // 7.5.
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_fixed_slashslash_fraction
	| value |
	value := 2.5s // (2 / 3).
	self assert: value equals: 3
!
(reader addMethod: 'tests')
!
test_fixed_slashslash_int
	| value |
	value := 2.5s // 7.
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_fixed_times_big
	| value |
	value := 2.5s * 251172765292171600923361522612285166173.
	self assert: value equals: 627931913230429002308403806530712915432.5s
!
(reader addMethod: 'tests')
!
test_fixed_times_fixed
	| value |
	value := 2.5s * 2.5s.
	self assert: value equals: 6.3s delta: 0.1
!
(reader addMethod: 'tests')
!
test_fixed_times_float
	| value |
	value := 2.5s * 7.5.
	self assert: value equals: 18.75
!
(reader addMethod: 'tests')
!
test_fixed_times_fraction
	| value |
	value := 2.5s * (2 / 3).
	self assert: value equals: 1.7s delta: 0.0666667
!
(reader addMethod: 'tests')
!
test_fixed_times_int
	| value |
	value := 2.5s * 7.
	self assert: value equals: 17.5s
!
(reader addMethod: 'tests')
!
test_fixed_times_zero
	| value |
	value := 2.5s * 0.
	self assert: value equals: 0.0s
!
(reader addMethod: 'tests')
!
test_float_backslashbackslash_big
	| value |
	value := 7.5 \\ 251172765292171600923361522612285166173.
	self assert: value equals: 7.5
!
(reader addMethod: 'tests')
!
test_float_backslashbackslash_fixed
	| value |
	value := 7.5 \\ 2.5s.
	self assert: value equals: 0.0
!
(reader addMethod: 'tests')
!
test_float_backslashbackslash_float
	| value |
	value := 7.5 \\ 7.5.
	self assert: value equals: 0.0
!
(reader addMethod: 'tests')
!
test_float_backslashbackslash_fraction
	| value |
	value := 7.5 \\ (2 / 3).
	self assert: value equals: 0.166667 delta: 9.83477e-7
!
(reader addMethod: 'tests')
!
test_float_backslashbackslash_int
	| value |
	value := 7.5 \\ 7.
	self assert: value equals: 0.5
!
(reader addMethod: 'tests')
!
test_float_minus_big
	| value |
	value := 7.5 - 251172765292171600923361522612285166173.
	self assert: value equals: -2.51173e38 delta: 4.46213e32
!
(reader addMethod: 'tests')
!
test_float_minus_fixed
	| value |
	value := 7.5 - 2.5s.
	self assert: value equals: 5.0
!
(reader addMethod: 'tests')
!
test_float_minus_float
	| value |
	value := 7.5 - 7.5.
	self assert: value equals: 0.0
!
(reader addMethod: 'tests')
!
test_float_minus_fraction
	| value |
	value := 7.5 - (2 / 3).
	self assert: value equals: 6.83333 delta: 6.67572e-6
!
(reader addMethod: 'tests')
!
test_float_minus_int
	| value |
	value := 7.5 - 7.
	self assert: value equals: 0.5
!
(reader addMethod: 'tests')
!
test_float_minus_zero
	| value |
	value := 7.5 - 0.
	self assert: value equals: 7.5
!
(reader addMethod: 'tests')
!
test_float_plus_big
	| value |
	value := 7.5 + 251172765292171600923361522612285166173.
	self assert: value equals: 2.51173e38 delta: 4.46213e32
!
(reader addMethod: 'tests')
!
test_float_plus_fixed
	| value |
	value := 7.5 + 2.5s.
	self assert: value equals: 10.0
!
(reader addMethod: 'tests')
!
test_float_plus_float
	| value |
	value := 7.5 + 7.5.
	self assert: value equals: 15.0
!
(reader addMethod: 'tests')
!
test_float_plus_fraction
	| value |
	value := 7.5 + (2 / 3).
	self assert: value equals: 8.16667 delta: 5.72205e-6
!
(reader addMethod: 'tests')
!
test_float_plus_int
	| value |
	value := 7.5 + 7.
	self assert: value equals: 14.5
!
(reader addMethod: 'tests')
!
test_float_plus_zero
	| value |
	value := 7.5 + 0.
	self assert: value equals: 7.5
!
(reader addMethod: 'tests')
!
test_float_quo__big
	| value |
	value := 7.5 quo: 251172765292171600923361522612285166173.
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_float_quo__fixed
	| value |
	value := 7.5 quo: 2.5s.
	self assert: value equals: 3
!
(reader addMethod: 'tests')
!
test_float_quo__float
	| value |
	value := 7.5 quo: 7.5.
	self assert: value equals: 1
!
(reader addMethod: 'tests')
!
test_float_quo__fraction
	| value |
	value := 7.5 quo: 2 / 3.
	self assert: value equals: 11
!
(reader addMethod: 'tests')
!
test_float_quo__int
	| value |
	value := 7.5 quo: 7.
	self assert: value equals: 1
!
(reader addMethod: 'tests')
!
test_float_rem__big
	| value |
	value := 7.5 rem: 251172765292171600923361522612285166173.
	self assert: value equals: 7.5
!
(reader addMethod: 'tests')
!
test_float_rem__fixed
	| value |
	value := 7.5 rem: 2.5s.
	self assert: value equals: 0.0
!
(reader addMethod: 'tests')
!
test_float_rem__float
	| value |
	value := 7.5 rem: 7.5.
	self assert: value equals: 0.0
!
(reader addMethod: 'tests')
!
test_float_rem__fraction
	| value |
	value := 7.5 rem: 2 / 3.
	self assert: value equals: 0.166667 delta: 9.83477e-7
!
(reader addMethod: 'tests')
!
test_float_rem__int
	| value |
	value := 7.5 rem: 7.
	self assert: value equals: 0.5
!
(reader addMethod: 'tests')
!
test_float_slashslash_big
	| value |
	value := 7.5 // 251172765292171600923361522612285166173.
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_float_slashslash_fixed
	| value |
	value := 7.5 // 2.5s.
	self assert: value equals: 3
!
(reader addMethod: 'tests')
!
test_float_slashslash_float
	| value |
	value := 7.5 // 7.5.
	self assert: value equals: 1
!
(reader addMethod: 'tests')
!
test_float_slashslash_fraction
	| value |
	value := 7.5 // (2 / 3).
	self assert: value equals: 11
!
(reader addMethod: 'tests')
!
test_float_slashslash_int
	| value |
	value := 7.5 // 7.
	self assert: value equals: 1
!
(reader addMethod: 'tests')
!
test_float_times_fixed
	| value |
	value := 7.5 * 2.5s.
	self assert: value equals: 18.75
!
(reader addMethod: 'tests')
!
test_float_times_float
	| value |
	value := 7.5 * 7.5.
	self assert: value equals: 56.25
!
(reader addMethod: 'tests')
!
test_float_times_fraction
	| value |
	value := 7.5 * (2 / 3).
	self assert: value equals: 5.0
!
(reader addMethod: 'tests')
!
test_float_times_int
	| value |
	value := 7.5 * 7.
	self assert: value equals: 52.5
!
(reader addMethod: 'tests')
!
test_float_times_zero
	| value |
	value := 7.5 * 0.
	self assert: value equals: 0.0
!
(reader addMethod: 'tests')
!
test_fraction_backslashbackslash_big
	| value |
	value := 2 / 3 \\ 251172765292171600923361522612285166173.
	self assert: value equals: 2 / 3
!
(reader addMethod: 'tests')
!
test_fraction_backslashbackslash_fixed
	| value |
	value := 2 / 3 \\ 2.5s.
	self assert: value equals: 0.7s delta: 0.0666667
!
(reader addMethod: 'tests')
!
test_fraction_backslashbackslash_float
	| value |
	value := 2 / 3 \\ 7.5.
	self assert: value equals: 0.666667 delta: 5.96046e-7
!
(reader addMethod: 'tests')
!
test_fraction_backslashbackslash_fraction
	| value |
	value := 2 / 3 \\ (2 / 3).
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_fraction_backslashbackslash_int
	| value |
	value := 2 / 3 \\ 7.
	self assert: value equals: 2 / 3
!
(reader addMethod: 'tests')
!
test_fraction_minus_big
	| value |
	value := 2 / 3 - 251172765292171600923361522612285166173.
	self assert: value equals: -753518295876514802770084567836855498517 / 3
!
(reader addMethod: 'tests')
!
test_fraction_minus_fixed
	| value |
	value := 2 / 3 - 2.5s.
	self assert: value equals: -1.8s delta: 0.0666667
!
(reader addMethod: 'tests')
!
test_fraction_minus_float
	| value |
	value := 2 / 3 - 7.5.
	self assert: value equals: -6.83333 delta: 6.67572e-6
!
(reader addMethod: 'tests')
!
test_fraction_minus_fraction
	| value |
	value := 2 / 3 - (2 / 3).
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_fraction_minus_int
	| value |
	value := 2 / 3 - 7.
	self assert: value equals: -19 / 3
!
(reader addMethod: 'tests')
!
test_fraction_minus_zero
	| value |
	value := 2 / 3 - 0.
	self assert: value equals: 2 / 3
!
(reader addMethod: 'tests')
!
test_fraction_plus_big
	| value |
	value := 2 / 3 + 251172765292171600923361522612285166173.
	self assert: value equals: 753518295876514802770084567836855498521 / 3
!
(reader addMethod: 'tests')
!
test_fraction_plus_fixed
	| value |
	value := 2 / 3 + 2.5s.
	self assert: value equals: 3.2s delta: 0.0666667
!
(reader addMethod: 'tests')
!
test_fraction_plus_float
	| value |
	value := 2 / 3 + 7.5.
	self assert: value equals: 8.16667 delta: 5.72205e-6
!
(reader addMethod: 'tests')
!
test_fraction_plus_fraction
	| value |
	value := 2 / 3 + (2 / 3).
	self assert: value equals: 4 / 3
!
(reader addMethod: 'tests')
!
test_fraction_plus_int
	| value |
	value := 2 / 3 + 7.
	self assert: value equals: 23 / 3
!
(reader addMethod: 'tests')
!
test_fraction_plus_zero
	| value |
	value := 2 / 3 + 0.
	self assert: value equals: 2 / 3
!
(reader addMethod: 'tests')
!
test_fraction_quo__big
	| value |
	value := 2 / 3 quo: 251172765292171600923361522612285166173.
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_fraction_quo__fixed
	| value |
	value := 2 / 3 quo: 2.5s.
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_fraction_quo__float
	| value |
	value := 2 / 3 quo: 7.5.
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_fraction_quo__fraction
	| value |
	value := 2 / 3 quo: 2 / 3.
	self assert: value equals: 1
!
(reader addMethod: 'tests')
!
test_fraction_quo__int
	| value |
	value := 2 / 3 quo: 7.
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_fraction_rem__big
	| value |
	value := 2 / 3 rem: 251172765292171600923361522612285166173.
	self assert: value equals: 2 / 3
!
(reader addMethod: 'tests')
!
test_fraction_rem__fixed
	| value |
	value := 2 / 3 rem: 2.5s.
	self assert: value equals: 0.7s delta: 0.0666667
!
(reader addMethod: 'tests')
!
test_fraction_rem__float
	| value |
	value := 2 / 3 rem: 7.5.
	self assert: value equals: 0.666667 delta: 5.96046e-7
!
(reader addMethod: 'tests')
!
test_fraction_rem__fraction
	| value |
	value := 2 / 3 rem: 2 / 3.
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_fraction_rem__int
	| value |
	value := 2 / 3 rem: 7.
	self assert: value equals: 2 / 3
!
(reader addMethod: 'tests')
!
test_fraction_slashslash_big
	| value |
	value := 2 / 3 // 251172765292171600923361522612285166173.
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_fraction_slashslash_fixed
	| value |
	value := 2 / 3 // 2.5s.
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_fraction_slashslash_float
	| value |
	value := 2 / 3 // 7.5.
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_fraction_slashslash_fraction
	| value |
	value := 2 / 3 // (2 / 3).
	self assert: value equals: 1
!
(reader addMethod: 'tests')
!
test_fraction_slashslash_int
	| value |
	value := 2 / 3 // 7.
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_fraction_times_big
	| value |
	value := 2 / 3 * 251172765292171600923361522612285166173.
	self assert: value equals: 502345530584343201846723045224570332346 / 3
!
(reader addMethod: 'tests')
!
test_fraction_times_fixed
	| value |
	value := 2 / 3 * 2.5s.
	self assert: value equals: 1.7s delta: 0.0666667
!
(reader addMethod: 'tests')
!
test_fraction_times_float
	| value |
	value := 2 / 3 * 7.5.
	self assert: value equals: 5.0
!
(reader addMethod: 'tests')
!
test_fraction_times_fraction
	| value |
	value := 2 / 3 * (2 / 3).
	self assert: value equals: 4 / 9
!
(reader addMethod: 'tests')
!
test_fraction_times_int
	| value |
	value := 2 / 3 * 7.
	self assert: value equals: 14 / 3
!
(reader addMethod: 'tests')
!
test_fraction_times_zero
	| value |
	value := 2 / 3 * 0.
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_int_backslashbackslash_big
	| value |
	value := 7 \\ 251172765292171600923361522612285166173.
	self assert: value equals: 7
!
(reader addMethod: 'tests')
!
test_int_backslashbackslash_fixed
	| value |
	value := 7 \\ 2.5s.
	self assert: value equals: 2.0s
!
(reader addMethod: 'tests')
!
test_int_backslashbackslash_float
	| value |
	value := 7 \\ 7.5.
	self assert: value equals: 7.0
!
(reader addMethod: 'tests')
!
test_int_backslashbackslash_fraction
	| value |
	value := 7 \\ (2 / 3).
	self assert: value equals: 1 / 3
!
(reader addMethod: 'tests')
!
test_int_backslashbackslash_int
	| value |
	value := 7 \\ 7.
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_int_minus_big
	| value |
	value := 7 - 251172765292171600923361522612285166173.
	self assert: value equals: -251172765292171600923361522612285166166
!
(reader addMethod: 'tests')
!
test_int_minus_fixed
	| value |
	value := 7 - 2.5s.
	self assert: value equals: 4.5s
!
(reader addMethod: 'tests')
!
test_int_minus_float
	| value |
	value := 7 - 7.5.
	self assert: value equals: -0.5
!
(reader addMethod: 'tests')
!
test_int_minus_fraction
	| value |
	value := 7 - (2 / 3).
	self assert: value equals: 19 / 3
!
(reader addMethod: 'tests')
!
test_int_minus_int
	| value |
	value := 7 - 7.
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_int_minus_zero
	| value |
	value := 7 - 0.
	self assert: value equals: 7
!
(reader addMethod: 'tests')
!
test_int_plus_big
	| value |
	value := 7 + 251172765292171600923361522612285166173.
	self assert: value equals: 251172765292171600923361522612285166180
!
(reader addMethod: 'tests')
!
test_int_plus_fixed
	| value |
	value := 7 + 2.5s.
	self assert: value equals: 9.5s
!
(reader addMethod: 'tests')
!
test_int_plus_float
	| value |
	value := 7 + 7.5.
	self assert: value equals: 14.5
!
(reader addMethod: 'tests')
!
test_int_plus_fraction
	| value |
	value := 7 + (2 / 3).
	self assert: value equals: 23 / 3
!
(reader addMethod: 'tests')
!
test_int_plus_int
	| value |
	value := 7 + 7.
	self assert: value equals: 14
!
(reader addMethod: 'tests')
!
test_int_plus_zero
	| value |
	value := 7 + 0.
	self assert: value equals: 7
!
(reader addMethod: 'tests')
!
test_int_quo__big
	| value |
	value := 7 quo: 251172765292171600923361522612285166173.
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_int_quo__fixed
	| value |
	value := 7 quo: 2.5s.
	self assert: value equals: 2
!
(reader addMethod: 'tests')
!
test_int_quo__float
	| value |
	value := 7 quo: 7.5.
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_int_quo__fraction
	| value |
	value := 7 quo: 2 / 3.
	self assert: value equals: 10
!
(reader addMethod: 'tests')
!
test_int_quo__int
	| value |
	value := 7 quo: 7.
	self assert: value equals: 1
!
(reader addMethod: 'tests')
!
test_int_rem__big
	| value |
	value := 7 rem: 251172765292171600923361522612285166173.
	self assert: value equals: 7
!
(reader addMethod: 'tests')
!
test_int_rem__fixed
	| value |
	value := 7 rem: 2.5s.
	self assert: value equals: 2.0s
!
(reader addMethod: 'tests')
!
test_int_rem__float
	| value |
	value := 7 rem: 7.5.
	self assert: value equals: 7.0
!
(reader addMethod: 'tests')
!
test_int_rem__fraction
	| value |
	value := 7 rem: 2 / 3.
	self assert: value equals: 1 / 3
!
(reader addMethod: 'tests')
!
test_int_rem__int
	| value |
	value := 7 rem: 7.
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_int_slashslash_big
	| value |
	value := 7 // 251172765292171600923361522612285166173.
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_int_slashslash_fixed
	| value |
	value := 7 // 2.5s.
	self assert: value equals: 2
!
(reader addMethod: 'tests')
!
test_int_slashslash_float
	| value |
	value := 7 // 7.5.
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_int_slashslash_fraction
	| value |
	value := 7 // (2 / 3).
	self assert: value equals: 10
!
(reader addMethod: 'tests')
!
test_int_slashslash_int
	| value |
	value := 7 // 7.
	self assert: value equals: 1
!
(reader addMethod: 'tests')
!
test_int_times_big
	| value |
	value := 7 * 251172765292171600923361522612285166173.
	self assert: value equals: 1758209357045201206463530658285996163211
!
(reader addMethod: 'tests')
!
test_int_times_fixed
	| value |
	value := 7 * 2.5s.
	self assert: value equals: 17.5s
!
(reader addMethod: 'tests')
!
test_int_times_float
	| value |
	value := 7 * 7.5.
	self assert: value equals: 52.5
!
(reader addMethod: 'tests')
!
test_int_times_fraction
	| value |
	value := 7 * (2 / 3).
	self assert: value equals: 14 / 3
!
(reader addMethod: 'tests')
!
test_int_times_int
	| value |
	value := 7 * 7.
	self assert: value equals: 49
!
(reader addMethod: 'tests')
!
test_int_times_zero
	| value |
	value := 7 * 0.
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_zero_backslashbackslash_big
	| value |
	value := 0 \\ 251172765292171600923361522612285166173.
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_zero_backslashbackslash_fixed
	| value |
	value := 0 \\ 2.5s.
	self assert: value equals: 0.0s
!
(reader addMethod: 'tests')
!
test_zero_backslashbackslash_float
	| value |
	value := 0 \\ 7.5.
	self assert: value equals: 0.0
!
(reader addMethod: 'tests')
!
test_zero_backslashbackslash_fraction
	| value |
	value := 0 \\ (2 / 3).
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_zero_backslashbackslash_int
	| value |
	value := 0 \\ 7.
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_zero_minus_big
	| value |
	value := 0 - 251172765292171600923361522612285166173.
	self assert: value equals: -251172765292171600923361522612285166173
!
(reader addMethod: 'tests')
!
test_zero_minus_fixed
	| value |
	value := 0 - 2.5s.
	self assert: value equals: -2.5s
!
(reader addMethod: 'tests')
!
test_zero_minus_float
	| value |
	value := 0 - 7.5.
	self assert: value equals: -7.5
!
(reader addMethod: 'tests')
!
test_zero_minus_fraction
	| value |
	value := 0 - (2 / 3).
	self assert: value equals: -2 / 3
!
(reader addMethod: 'tests')
!
test_zero_minus_int
	| value |
	value := 0 - 7.
	self assert: value equals: -7
!
(reader addMethod: 'tests')
!
test_zero_minus_zero
	| value |
	value := 0 - 0.
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_zero_plus_big
	| value |
	value := 0 + 251172765292171600923361522612285166173.
	self assert: value equals: 251172765292171600923361522612285166173
!
(reader addMethod: 'tests')
!
test_zero_plus_fixed
	| value |
	value := 0 + 2.5s.
	self assert: value equals: 2.5s
!
(reader addMethod: 'tests')
!
test_zero_plus_float
	| value |
	value := 0 + 7.5.
	self assert: value equals: 7.5
!
(reader addMethod: 'tests')
!
test_zero_plus_fraction
	| value |
	value := 0 + (2 / 3).
	self assert: value equals: 2 / 3
!
(reader addMethod: 'tests')
!
test_zero_plus_int
	| value |
	value := 0 + 7.
	self assert: value equals: 7
!
(reader addMethod: 'tests')
!
test_zero_plus_zero
	| value |
	value := 0 + 0.
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_zero_quo__big
	| value |
	value := 0 quo: 251172765292171600923361522612285166173.
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_zero_quo__fixed
	| value |
	value := 0 quo: 2.5s.
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_zero_quo__float
	| value |
	value := 0 quo: 7.5.
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_zero_quo__fraction
	| value |
	value := 0 quo: 2 / 3.
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_zero_quo__int
	| value |
	value := 0 quo: 7.
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_zero_rem__big
	| value |
	value := 0 rem: 251172765292171600923361522612285166173.
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_zero_rem__fixed
	| value |
	value := 0 rem: 2.5s.
	self assert: value equals: 0.0s
!
(reader addMethod: 'tests')
!
test_zero_rem__float
	| value |
	value := 0 rem: 7.5.
	self assert: value equals: 0.0
!
(reader addMethod: 'tests')
!
test_zero_rem__fraction
	| value |
	value := 0 rem: 2 / 3.
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_zero_rem__int
	| value |
	value := 0 rem: 7.
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_zero_slashslash_big
	| value |
	value := 0 // 251172765292171600923361522612285166173.
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_zero_slashslash_fixed
	| value |
	value := 0 // 2.5s.
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_zero_slashslash_float
	| value |
	value := 0 // 7.5.
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_zero_slashslash_fraction
	| value |
	value := 0 // (2 / 3).
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_zero_slashslash_int
	| value |
	value := 0 // 7.
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_zero_times_big
	| value |
	value := 0 * 251172765292171600923361522612285166173.
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_zero_times_fixed
	| value |
	value := 0 * 2.5s.
	self assert: value equals: 0.0s
!
(reader addMethod: 'tests')
!
test_zero_times_float
	| value |
	value := 0 * 7.5.
	self assert: value equals: 0.0
!
(reader addMethod: 'tests')
!
test_zero_times_fraction
	| value |
	value := 0 * (2 / 3).
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_zero_times_int
	| value |
	value := 0 * 7.
	self assert: value equals: 0
!
(reader addMethod: 'tests')
!
test_zero_times_zero
	| value |
	value := 0 * 0.
	self assert: value equals: 0
!
(reader addClassMethod: 'As yet unclassified')
!
generate
	#(#float #fixed #fraction #int #big #zero) with: (Core.Array
				with: 7.5
				with: 2.5s
				with: 2 / 3
				with: 7
				with: 251172765292171600923361522612285166173
				with: 0)
		do: 
			[:an :a |
			#(#float #fixed #fraction #int #big #zero) with: (Core.Array
						with: 7.5
						with: 2.5s
						with: 2 / 3
						with: 7
						with: 251172765292171600923361522612285166173
						with: 0)
				do: 
					[:bn :b |
					#(#* #+ #- #// #quo: #rem: #\\) do: 
							[:sel |
							self
								generateTest: an
								value: a
								op: sel
								arg: bn
								value: b]]]
!
(reader addClassMethod: 'As yet unclassified')
!
generateTest: an value: anInteger op: aSymbol arg: bn value: anInteger2
	| value delta |
	value := [anInteger perform: aSymbol with: anInteger2] on: Core.Error do: [:ex | ^self].
	delta := ((Smalltalk.Compiler evaluate: value printString) - value) abs asFloat * 2.
	self
		formatAndCompile: 'test_' , an , '_'
				, ((SP.SelectorConverter selectorAsFunctionName: aSymbol) reject: [:e | e = $$]) , '_'
				, bn , '
| value |
	value := ('
				, anInteger printString , ' '
				, aSymbol , ' '
				, anInteger2 printString , ').
	self assert: value equals: '
				, value printString
					, (delta isZero ifTrue: [''] ifFalse: [' delta: ' , delta printString])
		classified: 'tests'
!