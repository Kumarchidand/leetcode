/**
 * @param {string} val
 * @return {Object}
 */
var expect = function(val) {
    return {
        // these are two properties with passing values val as a argument
        // () is used to immediately-invoked function expression ,at the end of the method
        toBe:(v)=>(v===val)?true:(()=>{throw new Error("Not Equal")})(),
        notToBe:(v)=>(v!==val)? true:(()=>{throw new Error("Equal")})()
    }
};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */