/**
 *@auth 陈伯宇
 *@description vue通用组件
 */

/**
 *@description 工厂下拉自定义组件
 */
 Vue.component('vcomp_select_gc', {
	props: {
		'rowset': {
		      type: Object,
		      default: function () {
		    	  return [];
		      }
	    },
		'selected': "",
		'status': {
			default: 0
		},
		'name': "",
		'id': ""
	},
	template: '\
		<select class="chosen-select" name="{{name}}" id="{{id}}" v-model="selected" v-if="status==0">\
			<option value="">全部</option>\
			<option v-for="factory in rowset" v-bind:value="factory.factoryCode" v-text="factory.factoryName"></option>\
	    </select>\
		<select class="chosen-select" name="{{name}}" id="{{id}}" v-model="selected" disabled="disabled" v-else>\
			<option v-for="factory in rowset" v-bind:value="factory.factoryCode" v-text="factory.factoryName"></option>\
	    </select>\
    '
});